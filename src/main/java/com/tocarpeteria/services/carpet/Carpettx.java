package com.tocarpeteria.services.carpet;

import com.tocarpeteria.enums.City;
import com.tocarpeteria.interfaces.carpetPrices.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


import java.util.Map;
@Component
public class Carpettx implements Carpet {



    @Value("#{${TX}}")
    private Map<String,Integer> txUnitPrices;





    @Override
    public double getCarpetUnitPrice(City city) {

        return txUnitPrices.get(city);


    }
}
