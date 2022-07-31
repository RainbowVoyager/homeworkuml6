package com.cherevataya;

public class Driver extends Person {
    private String phoneNumber;
    private Parking parking;
    private Car car;
    private Ticket ticket;

    public Driver(String name, String surname, String phoneNumber, Car car, Parking parking) {
        super(name, surname);
        this.phoneNumber = phoneNumber;
        this.car = car;
        this.parking = parking;
    }

    public void buyTicket() {
        if (parking.getTickets().size() != 0 && ticket == null) {
            ticket = parking.getTickets().remove(0);
        }
    }

    public Ticket getTicket() {
        return this.ticket;
    }

    public void arrive() {
        if (ticket != null && parking.getSupervisor().validate(ticket)) {
            parking.arrive(car, 0);
        }
    }

//    public void depart() {
//        for (int i = 0; i < parking.getSize(); i++) {
//            Car[] arrayOfCars = parking.getParking();
//            if (car.equals(arrayOfCars[i])) {
//                parking.depart(i);
//                parking.setTickets(ticket);
//                ticket = null;
//                return;
//            }
//        }
//    }

    @Override
    public String toString() {
        return "Driver{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", car=" + car +
                "} " + super.toString();
    }
}
