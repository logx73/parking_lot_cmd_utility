package com.commandline.parking.client;

import com.commandline.parking.model.Car;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

import java.util.List;

public interface CarClient {
    @GetExchange("/v1/parking-management/cars")
    List<Car> getAllCars();

    @GetExchange("/v1/parking-management/cars/{colour}")
    List<Car> getCarByColour(@PathVariable String colour);

}
