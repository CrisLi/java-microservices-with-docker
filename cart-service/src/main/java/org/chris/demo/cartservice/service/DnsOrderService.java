package org.chris.demo.cartservice.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Profile("dns")
public class DnsOrderService implements OrderService {

    private final RestTemplate restTemplate;

    public DnsOrderService(OrderServiceProperties properties, RestTemplateBuilder builder) {
        this.restTemplate = builder
            .rootUri(properties.getUrl())
            .build();
    }

    @Override
    public String createOrder() {

        Map<String, Object> body = new HashMap<>();

        return restTemplate.postForObject("/orders", body, String.class);
    }

}
