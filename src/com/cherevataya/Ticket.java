package com.cherevataya;

public class Ticket {
    private int number;
    private String date;


    public Ticket() {
    }

    public Ticket(String date) {
        this.date = date;

    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", date='" + date + '\'' +
                '}';
    }
}
