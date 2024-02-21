package com.example.habibidemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HabibiDemoApplication

fun main(args: Array<String>) {
	runApplication<HabibiDemoApplication>(*args)
	println("Hello world 2 !")
}
