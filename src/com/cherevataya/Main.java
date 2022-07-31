package com.cherevataya;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Hawkins St.66", "Indiana");
        Ticket ticket = new Ticket("29.05.2022");
        Supervisor supervisor = new Supervisor("Steve", "Harrington", 27);
        Parking parking = new Parking(7, supervisor, ticket);

        Car first = new Car("Volkswagen", "98798");
        Car second = new Car("Mini Cooper", "63594");

        Driver driver1 = new Driver("Eddie", "Manson", "897666", first, parking);
        Driver driver2 = new Driver("Chrissy", "Cunningham", "2245764", second, parking);

        System.out.println(driver1);
        System.out.println(driver2);

        driver1.buyTicket();
        driver1.buyTicket();
        System.out.println(driver1.getTicket());
        driver1.arrive();

        driver2.buyTicket();
        System.out.println(driver2.getTicket());
        driver2.arrive();
        System.out.println(parking);

        System.out.println("Total amount of tickets: " + parking.getTickets().size());
        System.out.println(parking);
    }
}

