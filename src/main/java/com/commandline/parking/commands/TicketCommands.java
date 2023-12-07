package com.commandline.parking.commands;

import com.commandline.parking.client.ParkingSystemClient;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.List;

@ShellComponent
public class TicketCommands {

    private ParkingSystemClient parkingSystemClient;

    public TicketCommands(ParkingSystemClient parkingSystemClient) {
        this.parkingSystemClient = parkingSystemClient;
    }
    @ShellMethod(value = "This command is used to get ticket no by car registration no.")
    public Long ticketByRegNo(@ShellOption(help = "Write the registration number of Car") String regNo){
        return parkingSystemClient.getTicketByRegistrationNumber(regNo);
    }

    @ShellMethod(value = "This command is used to get ticket no's by car colour.")
    public List<Long> ticketsByCol(@ShellOption(help = "Write the colour of Car") String col){
        return parkingSystemClient.getTicketsByColour(col);
    }
}
