package com.train;

public class TicketJava {

    private int total;
    private int roundTrip;
    private int regularPrice = 1000;
    private int roundTripPrice = Math.toIntExact(Math.round(regularPrice * 2 * 0.9));

    public TicketJava(int total, int roundTrip) {
        this.total = total;
        this.roundTrip = roundTrip;
    }

    private int calculatePrice() {
        return ((total - roundTrip) * regularPrice) +
                (roundTripPrice * roundTrip);
    }

    public void print(){
        System.out.println("Java => Total tickets: " + total);
        System.out.println("Java => Round-trip: " + roundTrip);
        System.out.println("Java => Total: " + calculatePrice());
    }
}
