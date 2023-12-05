package com.commandline.parking.commands;

import com.commandline.parking.client.ParkingClient;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

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
}
