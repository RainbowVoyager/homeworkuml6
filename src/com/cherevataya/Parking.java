package com.cherevataya;

import java.util.ArrayList;
import java.util.Arrays;

public class Parking {
    private Car[] parking;
    private int size;
    private ArrayList<Ticket> tickets;
    private Ticket ticket;
    private Supervisor supervisor;

    public Parking(int parkingSize, Supervisor supervisor, Ticket ticket) {
        this.size = parkingSize;
        this.parking = new Car[this.size];
        this.supervisor = supervisor;
        this.tickets = new ArrayList<>();
        this.ticket = ticket;
        for (int i = 0; i < this.size; i++) {
            Ticket cloneTicket = new Ticket();
            cloneTicket.setDate(ticket.getDate());
            cloneTicket.setNumber(i + 1);
            tickets.add(cloneTicket);
        }
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public int getSize() {
        return size;
    }

    public Car[] getParking() {
        return parking;
    }

    public void setTickets(Ticket ticket) {
        tickets.add(ticket);
    }

    public boolean checkPlaceNumber(int placeNumber) {
        return placeNumber >= 0 && placeNumber < parking.length;
    }

    public void arrive(Car car, int placeNumber) {
        if (checkPlaceNumber(placeNumber)) {
            if (parking[placeNumber] == null) {
                parking[placeNumber] = car;
            } else if (parking[placeNumber] != null) {
                for (int i = placeNumber; i < parking.length; i++) {
                    if (parking[i] == null) {
                        parking[i] = car;
                        return;
                    }
                }
                for (int i = 0; i < placeNumber; i++) {
                    if (parking[i] == null) {
                        parking[i] = car;
                        return;
                    }
                }
            }
        }
    }

//    public void depart(int placeNumber) {
//        if (parking[placeNumber] != null) {
//            parking[placeNumber] = null;
//        }
//    }

    @Override
    public String toString() {
        return "Parking{" +
                "parking=" + Arrays.toString(parking) +
                ", freeSlots=" + tickets.size() +
                '}';
    }
}

