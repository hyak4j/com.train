package com.train;

public class TicketMachine {
    int one_way_ticket_number, // 記錄單程票張數
            round_trip_ticket_number; // 記錄來回票張數

    public TicketMachine(int one_way_ticket_number, int round_trip_ticket_number) {
        this.one_way_ticket_number = one_way_ticket_number;
        this.round_trip_ticket_number = round_trip_ticket_number;
    }

    // 輸出結果
    public void print(){
        System.out.println("Total tickets: " + sum() +  " Round-trip: " + round_trip_ticket_number + " Total: " + caculation());
    }

    // 計算總張數
    public int sum(){
        return one_way_ticket_number + round_trip_ticket_number;
    }

    // 計算付費金額
    public int caculation(){
        return (int) ((one_way_ticket_number * 1000) + (round_trip_ticket_number * 2000 * 0.9f));
    }
}
