package com.software.cprk.`3_Functions`.`24_recursion`

fun main (args: Array<String>) {
    countUp(0, 10)
}
fun countUp(startingNumber: Int, number: Int) {
    println("startingNumber: "+startingNumber)
    var nextNumber = startingNumber + 1
    if(startingNumber < number) {
        countUp(nextNumber, number)
    }
}