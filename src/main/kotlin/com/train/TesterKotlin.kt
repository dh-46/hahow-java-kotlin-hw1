package com.train

import java.util.*
import kotlin.math.roundToInt

fun main() {
    val scanner = Scanner(System.`in`)
    print("Kotlin => Please enter number of tickets: ")
    val total = scanner.nextInt()
    print("Kotlin => How many round-trip tickets:  ")
    val roundTrip = scanner.nextInt()
    val ticket = Ticket(total, roundTrip)
    ticket.printResult()
}

class Ticket(private var total: Int,
             private var roundTrip: Int) {

    private val regularPrice = 1000;
    private val roundTripPrice = (2000 * 0.9).roundToInt()

    private fun calculatePrices() : Int{
        return ((total - roundTrip) * regularPrice) + roundTripPrice * roundTrip
    }

    fun printResult(){
        println("Kotlin => Total tickets: $total")
        println("Kotlin => Round-trip: $roundTrip")
        println("Kotlin => Total: " + calculatePrices())
    }
}