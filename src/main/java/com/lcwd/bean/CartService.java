package com.lcwd.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@Scope("prototype")
public class CartService {
    @Bean
    OrderService play()
    {

        return new OrderService();
    }


    public void onecart()
    {

        System.out.println("one cart can be created");
    }

}
