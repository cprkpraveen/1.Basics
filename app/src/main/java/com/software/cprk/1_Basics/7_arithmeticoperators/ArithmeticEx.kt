package com.software.cprk.`1_Basics`.`7_arithmeticoperators`

fun main (args: Array<String>) {
    var num1 = 55
    var num2 = 25
    /*
        ---------------------------------------------------
            Arithmetic Operators
        ---------------------------------------------------
     */
    //Addition Operator
    println( "Addition: "+(num1+num2)) // 80

    // Substraction Operator
    println("Substraction: "+(num1-num2)) // 30

    // Multiple Operator
    println("Substraction: "+(num1*num2)) // 1375

    // Division Operator
    println("Division Int: "+(num1/num2)) // 2
    println("Division Float: "+(num1.toFloat()/num2.toFloat())) //2.2

    // Modulus Operator
    println("Modulus: "+(num1%num2)) // 5
}