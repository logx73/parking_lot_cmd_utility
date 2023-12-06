package com.commandline.parking.commands;

import com.commandline.parking.client.ParkingClient;
import com.commandline.parking.model.Car;
import com.commandline.parking.model.Ticket;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ParkingLotCommands {

    private ParkingClient parkingClient;

    public ParkingLotCommands(ParkingClient parkingClient) {
        this.parkingClient = parkingClient;
    }

    @ShellMethod("create parking")
    String createParking(Integer parkingCapacity){
        return parkingClient.createParking(parkingCapacity);
    }

    @ShellMethod("park")
    Ticket parkingCar(@ShellOption(value = "-s") String registrationNumber,@ShellOption(value = "-c") String colour){
        Car car = new Car();
        car.setRegistrationNumber(registrationNumber);
        car.setColour(colour);
        Ticket ticket = new Ticket();
        ticket.setCar(car);
        ticket.setParkingLot(null);
        return parkingClient.park(ticket);
    }
}
