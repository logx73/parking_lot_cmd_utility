package com.commandline.parking.client;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.PostExchange;

public interface ParkingClient {
    @PostExchange("/v1/parking-management/parking/{parkingCapacity}")
    String createParking(@PathVariable Integer parkingCapacity);
}
