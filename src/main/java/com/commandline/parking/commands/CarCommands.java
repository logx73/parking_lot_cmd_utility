package com.commandline.parking.commands;

import com.commandline.parking.client.CarClient;
import com.commandline.parking.model.Car;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class CarCommands {

    private CarClient carClient;

    public CarCommands(CarClient carClient){
        this.carClient = carClient;
    }

    @ShellMethod(key = "Car")
    List<Car> getCarByColour(String colour){
        return carClient.getCarByColour(colour);
    }
    @ShellMethod(key = "Car")
    List<Car> getAllCar(){
        return carClient.getAllCars();
    }
}
