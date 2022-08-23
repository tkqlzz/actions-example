package com.tkqlzz.actionsexample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages= ["com.tkqlzz"])
class ActionsExampleApplication

fun main(args: Array<String>) {
	runApplication<ActionsExampleApplication>(*args)
}
