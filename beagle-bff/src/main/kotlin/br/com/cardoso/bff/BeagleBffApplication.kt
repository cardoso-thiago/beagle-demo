package br.com.cardoso.bff

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeagleBffApplication

fun main(args: Array<String>) {
    runApplication<BeagleBffApplication>(*args)
}
