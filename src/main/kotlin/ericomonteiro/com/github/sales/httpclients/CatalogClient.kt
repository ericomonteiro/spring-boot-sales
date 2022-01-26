package ericomonteiro.com.github.sales.httpclients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestHeader

@FeignClient(value = "catalogClient", url = "\${catalog.httpclient.host}")
interface CatalogClient {

    @GetMapping("/home")
    fun home(@RequestHeader(value = HttpHeaders.AUTHORIZATION) authorization: String): String

}