package com.tocarpeteria.services.floor;

import com.tocarpeteria.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements Floor {

    @Value("${bedRoomLengths}")
    int [] bedRoomLengths;
    @Override
    public double getFloorArea() {
        return bedRoomLengths[0]*bedRoomLengths[1];
    }

}
