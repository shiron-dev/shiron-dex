package dev.shiron.shirondex

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ShironDexApplication

fun main(args: Array<String>) {
	runApplication<ShironDexApplication>(*args)
}
