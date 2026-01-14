package com.meta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("hello/request")
public class DataRequestController {
    @GetMapping("form/html")
    public String form() {
        return "hello-request-form";
    }
}
