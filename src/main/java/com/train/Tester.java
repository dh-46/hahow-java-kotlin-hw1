package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Java => Please enter number of tickets: ");
        int total = scanner.nextInt();
        System.out.println("Java => How many round-trip tickets: ");
        int roundTrip = scanner.nextInt();
        TicketJava ticketJava = new TicketJava(total, roundTrip);
        ticketJava.print();
    }
}
