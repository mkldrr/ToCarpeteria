package com.tocarpeteria.services.carpet;

import com.tocarpeteria.enums.City;
import com.tocarpeteria.interfaces.carpetPrices.Carpet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Map;
@Component
public class Carpettx implements Carpet {

    City city;

    @Value("#{${TX}}")
    private Map<String,Integer> txUnitPrices;




    @Override
    public int getCarpetPrice() {

        return txUnitPrices.get(city);


    }
}
