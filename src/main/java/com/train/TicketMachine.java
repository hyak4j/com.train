package com.train;

public class TicketMachine {
    int ticket_number,
            round_trip_ticket_number;

    public TicketMachine(int ticket_number, int round_trip_ticket_number) {
        this.ticket_number = ticket_number;
        this.round_trip_ticket_number = round_trip_ticket_number;
    }

    // print result
    public void print(){
        System.out.println("Total tickets: " + ticket_number +  " Round-trip: " + round_trip_ticket_number + " Total: " + caculation());
    }

    // count oneWayTicket
    public int oneWayTicketNumber(){
        return ticket_number - round_trip_ticket_number;
    }

    // payment caculation
    public int caculation(){
        return (int) ((oneWayTicketNumber() * 1000) + (round_trip_ticket_number * 2000 * 0.9f));
    }
}
