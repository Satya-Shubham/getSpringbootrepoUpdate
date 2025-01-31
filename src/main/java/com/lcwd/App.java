package com.lcwd;

import com.lcwd.bean.CartService;
import com.lcwd.bean.OrderService;
import com.lcwd.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;

/**
 * Hello world!
 *
 */

public class App

{
   @Autowired
    OrderService ord3;
    public static void main( String[] args )
    {
        System.out.println( "App is ready for testing" );

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println(context);
    CartService Cartservice1=context.getBean("Cartservice1",CartService.class);
        Cartservice1.onecart();
        OrderService OrderService1=context.getBean(OrderService.class);
        OrderService1.order();
       CartService order1= context.getBean("order1", CartService.class);
       order1.onecart();


    }
}
