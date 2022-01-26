package ericomonteiro.com.github.sales.httpclients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(value = "catalogClient", url = "\${catalog.httpclient.host}")
interface CatalogClient {

    @GetMapping("/home")
    fun home(): String

}