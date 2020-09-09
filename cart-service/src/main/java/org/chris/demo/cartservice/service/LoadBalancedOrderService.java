package org.chris.demo.cartservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

@Service
@Profile("consul")
@RequiredArgsConstructor
public class LoadBalancedOrderService implements OrderService {

    private final RestTemplate restTemplate;

    @Override
    public String createOrder() {

        Map<String, Object> body = new HashMap<>();

        return restTemplate.postForObject("http://order-service/orders", body, String.class);
    }

}
