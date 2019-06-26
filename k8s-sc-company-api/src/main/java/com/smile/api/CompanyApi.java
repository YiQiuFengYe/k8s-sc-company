package com.smile.api;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "service-company")
public interface CompanyApi {

    @GetMapping("/list")
    List list();
}
