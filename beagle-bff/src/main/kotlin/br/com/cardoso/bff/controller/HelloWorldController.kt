package br.com.cardoso.bff.controller

import br.com.cardoso.bff.service.HelloWorldService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController(val helloWorldService: HelloWorldService) {

    @GetMapping("/builder")
    fun getBuilder() = helloWorldService.createScreenBuilder()
}