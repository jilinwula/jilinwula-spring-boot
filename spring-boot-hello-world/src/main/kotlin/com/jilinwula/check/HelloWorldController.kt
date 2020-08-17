package com.jilinwula.check

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/helloworld")
class HelloWorldController {
    @GetMapping("/school")
    fun school(): Any {
        var list = listOf<String>("吉林乌拉工学院","吉林乌拉农学院","吉林乌拉商学院","吉林乌拉医学院","吉林乌拉理学院")
        return list
    }
}