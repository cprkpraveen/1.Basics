package com.software.cprk.`2_Control_Statements`.`14_conditionalifstatement`

fun main (args: Array<String>) {
    val num1 = 98

    /*if( num1 == 67) {
        println("It is equal to 67")
    }else if(num1 == 58){
        println("It is equal to 58")
    }else if (num1 == 90) {
        println("It is equal to 90")
    }else {
        println("Default statement")
    }*/
    val result = if(num1 == 67){
        println("It is equal to 67")
        "67"
    }else if (num1 == 50) {
        println("It is equal to 50")
        "50"
    }else if (num1 == 9) {
        println("It is equal to 9")
        "9"
    }else {
        println("Default statement")
        "Default"
    }
    println(result)
}