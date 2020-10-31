package com.tocarpeteria.services.floor;

import com.tocarpeteria.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom implements Floor {


    @Value("${livingRoomLengths}")
    int [] livingRoomLengths;
    @Override
    public double getFloorArea() {
        return livingRoomLengths[0]*livingRoomLengths[1];
    }
}
