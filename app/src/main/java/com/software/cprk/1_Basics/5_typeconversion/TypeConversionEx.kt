package com.software.cprk.`1_Basics`.`5_typeconversion`

fun main (args : Array<String>){
    var i = 9
    println("Type Conversion in int: $i") //9
    var xlong : Long = i.toLong()
    println("Type Conversion to Long: $xlong") //9
    var epicString : String
    epicString = xlong.toString()
    println("Type Conversion : $epicString") //"9" --> 9

    val intValue = epicString.toInt()

    println("Type Conversion to Int : $intValue") // 9
}