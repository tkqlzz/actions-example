package com.tkqlzz.actionsexample

import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component

@Component
class Runner : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        println("hi")
    }
}