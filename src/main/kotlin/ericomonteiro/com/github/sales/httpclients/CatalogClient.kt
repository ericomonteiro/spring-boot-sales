package ericomonteiro.com.github.sales.httpclients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.HttpHeaders
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader

@FeignClient(value = "catalogClient", url = "\${catalog.httpclient.host}")
interface CatalogClient {

    @PostMapping("/home")
    fun home(
        @RequestHeader(value = HttpHeaders.AUTHORIZATION) authorization: String,
        @RequestBody anyBody: Map<String, Any>
    ): String

}