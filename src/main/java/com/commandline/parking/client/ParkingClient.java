package com.commandline.parking.client;

import com.commandline.parking.model.Ticket;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PostExchange;

public interface ParkingClient {
    @PostExchange("/v1/parking-management/parking/{parkingCapacity}")
    String createParking(@PathVariable Integer parkingCapacity);

    @PostExchange("/v1/parking-management/ticket")
    Ticket park(@RequestBody Ticket ticket);
}
