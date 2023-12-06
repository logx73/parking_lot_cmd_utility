package com.commandline.parking.client;

import com.commandline.parking.model.Ticket;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;

import java.util.List;

public interface ParkingClient {
    @PostExchange("/v1/parking-management/parking/{parkingCapacity}")
    String createParking(@PathVariable Integer parkingCapacity);

    @PostExchange("/v1/parking-management/ticket")
    Ticket park(@RequestBody Ticket ticket);

    @GetExchange("/v1/parking-managment/ticket")
    Long getTicketByRegistrationNumber(@RequestParam String registrationNumber);

    @GetExchange("/v1/parking-managment/tickets")
    List<Long> getTicketsByColour(@RequestParam String colour);
}
