package com.cherevataya;

public class Supervisor extends Person{

    private final int id;
    public Supervisor(String name, String surname, int id) {
        super(name, surname);
        this.id = id;
    }

    public boolean validate(Ticket ticket) {
        if (ticket != null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "id=" + id +
                "} " + super.toString();
    }
}
