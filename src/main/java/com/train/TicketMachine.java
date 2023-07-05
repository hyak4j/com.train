package com.train;

public class TicketMachine {
    int ticket_number,
            round_trip_ticket_number;
    final int oneWayTicketPrice = 1000;
    final float roundTripDiscount = 0.9f;
    final int roundTripTicketPrice = (int) (2000 * roundTripDiscount);

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
        return (oneWayTicketNumber() * oneWayTicketPrice) + (round_trip_ticket_number * roundTripTicketPrice);
    }
}
