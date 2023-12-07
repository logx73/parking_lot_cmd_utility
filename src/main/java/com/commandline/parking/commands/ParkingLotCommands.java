package com.commandline.parking.commands;

import com.commandline.parking.client.ParkingSystemClient;
import com.commandline.parking.model.Car;
import com.commandline.parking.model.Ticket;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class ParkingLotCommands {

    private ParkingSystemClient parkingSystemClient;

    public ParkingLotCommands(ParkingSystemClient parkingSystemClient) {
        this.parkingSystemClient = parkingSystemClient;
    }

    @ShellMethod(value = "This command is used to create parking lot.")
    String createParking(@ShellOption(help = "Write the capacity of parking space") Integer cpty){
        return parkingSystemClient.createParking(cpty);
    }

    @ShellMethod(value = "This command is used to park the car.")
    Ticket parkCar(@ShellOption(help = "Write the registration number of Car") String regNo,@ShellOption(help = "Write the colour of the car") String col){
        Car car = new Car();
        car.setRegistrationNumber(regNo);
        car.setColour(col);
        Ticket ticket = new Ticket();
        ticket.setCar(car);
        ticket.setParkingLot(null);
        return parkingSystemClient.park(ticket);
    }
}
