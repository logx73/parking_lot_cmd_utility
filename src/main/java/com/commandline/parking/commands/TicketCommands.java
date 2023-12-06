package com.commandline.parking.commands;

import com.commandline.parking.client.ParkingClient;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class TicketCommands {

    private ParkingClient parkingClient;

    public TicketCommands(ParkingClient parkingClient) {
        this.parkingClient = parkingClient;
    }
    @ShellMethod("ticket")
    public Long getTicketByRegistrationNumber(@ShellOption(value = "-s") String registrationNumber){
        return parkingClient.getTicketByRegistrationNumber(registrationNumber);
    }

    @ShellMethod("ticket")
    public List<Long> getTicketsByColour(@ShellOption(value = "-c") String colour){
        return parkingClient.getTicketsByColour(colour);
    }
}
