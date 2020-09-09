package org.chris.demo.cartservice.web;

import org.chris.demo.cartservice.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/carts")
@RequiredArgsConstructor
public class CartController {

    private final OrderService orderService;

    @PostMapping("/submit")
    public String submit() {
        // submit cart and create order
        return orderService.createOrder();
    }

}
