package com.tocarpeteria.services.floor;

import com.tocarpeteria.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {

    @Value("${kitchenRadius}")
    int kitchenRadius;
    @Override
    public double getFloorArea() {
        return Math.pow(kitchenRadius,2) *Math.PI;
    }
}
