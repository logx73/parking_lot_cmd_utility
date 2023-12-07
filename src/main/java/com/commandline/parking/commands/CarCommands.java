package com.commandline.parking.commands;

import com.commandline.parking.client.ParkingSystemClient;
import com.commandline.parking.model.Car;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class CarCommands {

    private ParkingSystemClient parkingSystemClient;

    public CarCommands(ParkingSystemClient parkingSystemClient){
        this.parkingSystemClient = parkingSystemClient;
    }

    @ShellMethod(value = "This command is used get all cars by colour.")
    List<String> carByColour(@ShellOption(help = "Write the colour of Car") String col){
        return parkingSystemClient.getCarByColour(col);
    }
    @ShellMethod(value = "This command is used get all cars in the parking.")
    List<Car> allCar(){
        return parkingSystemClient.getAllCars();
    }
}
