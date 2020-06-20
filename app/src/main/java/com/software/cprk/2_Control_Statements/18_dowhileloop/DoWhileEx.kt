package com.software.cprk.`2_Control_Statements`.`18_dowhileloop`

fun main (args: Array<String>) {
    var x = 100
    while (x <= 10) {
        println(x)
        x++ // x += 1 or x = x+1
    }

    println("Do While Loop")
    x = 100
    do{
        println(x)
        x++
    }while (x <= 10)
}