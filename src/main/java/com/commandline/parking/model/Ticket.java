package com.commandline.parking.model;

public class Ticket {

    private Long ticketId;
    private Car car;
    private ParkingLot parkingLot;
    public Ticket(Long ticketId, Car car, ParkingLot parkingLot) {
        this.ticketId = ticketId;
        this.car = car;
        this.parkingLot = parkingLot;
    }

    public Ticket() {
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", car=" + car +
                ", parkingLot=" + parkingLot +
                '}';
    }
}
