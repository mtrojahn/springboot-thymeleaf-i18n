package com.marcelustrojahn.boot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan


@SpringBootApplication
@ComponentScan(basePackages = ["com.marcelustrojahn.controllers"])
class Application {

    static void main(String[] args) {
        SpringApplication.run(Application, args)
    }
}
