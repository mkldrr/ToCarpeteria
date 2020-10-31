package com.tocarpeteria;

import com.tocarpeteria.interfaces.carpetPrices.Carpet;
import com.tocarpeteria.interfaces.floorTypes.Floor;
import com.tocarpeteria.services.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ToCarpeteriaApp {

    public static void main(String[] args) {


        SpringApplication.run(ToCarpeteriaApp.class, args);

        ApplicationContext container = SpringApplication.run(ToCarpeteriaApp.class, args);
        Carpet carpet = container.getBean("carpettx",Carpet.class);
        Floor floor = container.getBean("bedroom",Floor.class);

        //TODO: carpet and floor type calculation will be done.
        Calculator calculator = container.getBean(Calculator.class);





    }


}
