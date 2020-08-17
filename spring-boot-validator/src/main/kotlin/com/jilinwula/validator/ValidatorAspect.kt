package com.jilinwula.validator

import lombok.extern.slf4j.Slf4j
import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component
import org.springframework.validation.BindingResult

@Slf4j
@Aspect
@Component
class ValidatorAspect {
    @Before("execution(public * com.jilinwula.validator..*(..))")
    fun doBefore(joinPoint: JoinPoint) {
        for (arg in joinPoint.args) {
            if (arg is BindingResult) {
                val result = arg
                if (result.hasErrors()) {
                    val error = result.fieldError
                    val ret = Return()
                    ret.error(error!!.field, error.defaultMessage)
                }
            }
        }
    }
}