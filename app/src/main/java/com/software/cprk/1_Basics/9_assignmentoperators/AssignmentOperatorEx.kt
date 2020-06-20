package com.software.cprk.`1_Basics`.`9_assignmentoperators`

fun main (args: Array<String>) {

    // Basic Assignment Operator
    var num1 = 55

    /*
        --------------------
        Assignment Operators
        --------------------
     */

    // Addition Assignment Operator
    num1 += 5 // num1 = num1 + 5
    println("Addition Assignment: "+num1) // 60

    num1 = 55

    // Subtraction Assignment Operator
    num1 -= 5 // num1 = num1 - 5
    println("Subtraction Assignment: "+num1) //50

    num1 = 55

    // Multiplication Assignment Operator
    num1 *= 5 // num1 = num1 * 5
    println("Multiplication Assignment: "+num1) //275

    num1 = 55

    // Division Assignment Operator
    num1 /= 5 // num1 = num1 / 5
    println("Division Assignment: "+num1) //11

    num1 = 57

    // Modulus Assignment Operator
    num1 %= 5 // num1 = num1 % 5
    println("Modulus Assignment: "+num1) //2

}