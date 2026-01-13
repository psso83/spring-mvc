package com.meta.springmvc.controller;

import com.meta.springmvc.entity.Star;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/response/json")
public class DataResponseController {
    @GetMapping("string")
    public String helloStringJson() {
        return "{\"name\" : \"Meta\" , \"age\" : 22}";
    }

    @GetMapping("class")
    public Star helloClassJson() {
        return new Star("Meta", 30);
    }
}
