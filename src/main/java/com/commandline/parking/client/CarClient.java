package com.commandline.parking.client;

import com.commandline.parking.model.Car;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface CarClient {
    @GetExchange("/v1/parking-management/cars")
    List<Car> getCarColour();
}
