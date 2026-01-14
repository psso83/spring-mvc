package com.meta.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("hello/request")
public class DataRequestController {
    @GetMapping("form/html")
    public String form() {
        return "hello-request-form";
    }

    @GetMapping("/star/{name}/age/{age}")
    @ResponseBody
    public String helliRequestPath(@PathVariable String name, @PathVariable int age) {
        return String.format("Hello, @PathVatiable로 받은 데이터값들, <br> name = %s, age = %d", name, age);
    }

    @GetMapping("form/param")
    @ResponseBody
    public String helloRequestParam(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @RequestParam으로 받은 값들, <br> name = %s, age = %d", name, age);
    }

    @PostMapping("form/param")
    @ResponseBody
    public String helloRequestParamPost(@RequestParam String name, @RequestParam int age) {
        return String.format("Hello, @RequestParam으로 받은 값들, <br> name = %s, age = %d", name, age);
    }
}
