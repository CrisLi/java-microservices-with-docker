package org.chris.demo.cartservice.service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties("order-service")
public class OrderServiceProperties {

    private String url;

}
