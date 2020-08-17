package com.jilinwula.validator

import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/userinfo")
class UserinfoController {
    @GetMapping("/query")
    fun list(@Valid userBase:  UserBase?, result: BindingResult): Any? {
        userBase!!.username = "吉林乌拉学院院长"
        return userBase
    }
}