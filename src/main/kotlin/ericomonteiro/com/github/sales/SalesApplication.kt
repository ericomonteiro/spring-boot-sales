package ericomonteiro.com.github.sales

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class SalesApplication

fun main(args: Array<String>) {
	runApplication<SalesApplication>(*args)
}
