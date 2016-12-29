package com.marcelustrojahn.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping


@Controller
class HelloWorldController {

    @GetMapping("/helloworld")
    helloWorld() {
        "helloworld"
    }
}
