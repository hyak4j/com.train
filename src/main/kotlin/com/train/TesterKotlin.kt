package com.train

import java.util.*

fun main() {
    userInput()
}

private fun userInput() {
    // ask ticket numbers
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    val ticket_number = scanner.nextInt()   // 記錄總車票張數
    println("How many round-trip tickets:")
    val round_trip_ticket_number = scanner.nextInt() // 記錄來回票張數
    val ticketMachine = TicketMachineKotlin(ticket_number, round_trip_ticket_number)
    ticketMachine.print()
}

class TicketMachineKotlin(var ticket_number :Int, var round_trip_ticket_number :Int){
    // 輸出結果
    fun print(){
        println("Total tickets: " + ticket_number + " Round-trip: " + round_trip_ticket_number + " Total: " + caculation())
    }

    // 計算總張數
    private fun oneWayTicketNumber() :Int {
        return ticket_number - round_trip_ticket_number
    }

    // 計算付費金額
    private fun caculation() :Int{
        return ((oneWayTicketNumber() * 1000) + (round_trip_ticket_number * 2000 * 0.9f).toInt())
    }
}

