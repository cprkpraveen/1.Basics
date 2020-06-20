package com.software.cprk.`1_Basics`.`13_inputandoutput`

fun main(args : Array<String>) {
    print("Hello ")
    print("World..")
    println("World")
    println("Please enter any type of value for input:")

    var data = readLine()
    println("The Output is: $data")

    // Enter a value with Integer type

    println("Please enter a Integer value for input:")

    var strData : String? = readLine()
    var intData : Int = Integer.valueOf(strData.toString())
    println("The Output is: $intData")


}