package ericomonteiro.com.github.sales.controller

import ericomonteiro.com.github.sales.httpclients.CatalogClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController(
    private val catalogClient: CatalogClient
) {

    private val logger: Logger = LoggerFactory.getLogger(HomeController::class.java)

    @GetMapping
    fun hello(@RequestHeader(value = HttpHeaders.AUTHORIZATION) authorization: String): String {
        logger.info("Home controller sales service")
        return "Sales System was called and after - ${catalogClient.home(authorization)}"
    }

}