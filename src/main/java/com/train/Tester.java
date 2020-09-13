package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        int total = 0;
        while (total != -1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Java => Please enter number of tickets: ");
            total = scanner.nextInt();
            if (total == -1) {
                break;
            }
            System.out.println("Java => How many round-trip tickets: ");
            int roundTrip = scanner.nextInt();
            TicketJava ticketJava = new TicketJava(total, roundTrip);
            ticketJava.print();
        }
    }
}
