package com.jilinwula.validator

import com.alibaba.fastjson.JSONObject
import com.fasterxml.jackson.databind.util.JSONPObject
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@Slf4j
@RestControllerAdvice
class ValidatorHandler {
    /**
     * 校验错误拦截处理
     *
     * @param e 错误信息集合
     * @return 错误信息
     */
    @ExceptionHandler(ValidatorException::class)
    fun handle(e: ValidatorException): Any? {
        return JSONObject.toJSONString(e.r)
    }
}