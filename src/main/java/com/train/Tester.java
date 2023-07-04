package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        userInput();
    }

    private static void userInput() {
        // ask ticket numbers
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of one_way_ticket tickets:");
        int one_way_ticket_number = scanner.nextInt();
        System.out.println("How many round-trip tickets:");
        int round_trip_ticket_number = scanner.nextInt();
        // print ticket numbers and payment
        TicketMachine ticketMachine = new TicketMachine(one_way_ticket_number, round_trip_ticket_number);
        ticketMachine.print();
    }
}
