package com.lcwd.config;

import com.lcwd.bean.CartService;
import com.lcwd.bean.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = {"com.lcwd"})
public class AppConfig {
    @Bean("Cartservice1")
    public CartService cartService()
    {

        return new CartService();
    }



}
