package com.example.habibidemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service

@SpringBootApplication
class HabibiDemoApplication


fun main(args: Array<String>) {
	runApplication<HabibiDemoApplication>(*args)
	println("Hello world 2 !")
}
