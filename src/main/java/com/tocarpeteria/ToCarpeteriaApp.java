package com.tocarpeteria;

import com.tocarpeteria.interfaces.carpetPrices.Carpet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ToCarpeteriaApp {

    public static void main(String[] args) {


        SpringApplication.run(ToCarpeteriaApp.class, args);

        ApplicationContext container = SpringApplication.run(ToCarpeteriaApp.class, args);
        Carpet carpet = container.getBean("carpettx",Carpet.class);

        //TODO: carpet and floor type calculation will be done.

        System.out.println(carpet.getCarpetPrice());
    }


}
