package com.software.cprk.`3_Functions`.`23_returnvalues`

fun main (args: Array<String>) {
   var number = addition(4,5)
    println(number)
    println(number * number)
}
fun addition (num1: Int, num2: Int) : Int {
    val result = num1 + num2
    return result
}