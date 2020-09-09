package org.chris.demo.orderservice.web;

import java.util.Map;

import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final Environment env;

    @PostMapping
    public String create(@RequestBody Map<String, Object> params) {
        return "Order created by " + env.getProperty("HOSTNAME");
    }

}
