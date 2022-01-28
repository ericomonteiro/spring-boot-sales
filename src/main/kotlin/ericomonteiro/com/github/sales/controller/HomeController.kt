package ericomonteiro.com.github.sales.controller

import ericomonteiro.com.github.sales.httpclients.CatalogClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class HomeController(
    private val catalogClient: CatalogClient
) {

    private val logger: Logger = LoggerFactory.getLogger(HomeController::class.java)

    val sampleJwtToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c"

    @GetMapping
    fun hello(): String {
        logger.info("Home controller sales service")
        return "Sales System was called and after - ${catalogClient.home(sampleJwtToken, generateAnyBody())}"
    }

    private fun generateAnyBody(): MutableMap<String, String> {
        val body = mutableMapOf<String, String>()
        body["field-01"] = "some value"
        body["field-02"] = "another value"
        return body
    }

}