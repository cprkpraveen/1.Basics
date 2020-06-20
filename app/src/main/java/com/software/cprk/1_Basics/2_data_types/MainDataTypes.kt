package com.software.cprk.`1_Basics`.`2_data_types`

fun main(args : Array<String>){
    var byteType : Byte = -128
    var shortType : Short = -32768
    var intType : Int = 10
    var longType : Long = 1234567890123456789
    var floatType : Float = 25.65f
    var doubleType : Double = 25266.65
    var charType : Char = 'A'
    var strType : String = "Kotlin Data Types"

    println("=============Range of the Data types in negative value========================")
    println("Byte Data type: $byteType")
    println("Short Data type: $shortType")
    println("Integer Data type: $intType")
    println("Long Data type: $longType")
    println("Float Data type: $floatType")
    println("Double Data type: $doubleType")
    println("Char Type: $charType")
    println("String Type: $strType")

    byteType = 127
    shortType = 32767
    intType = 25563
    longType = 876543210987654321
    floatType = 50.35f
    doubleType = 22566.56
    charType = 'b'
    strType = "BASICS OF KOTLIN"

    println("=============Range of the Data types in Positive value========================")
    println("==============After changes=======================")
    println("Byte Data type: $byteType")
    println("Short Data type: $shortType")
    println("Integer Data type: $intType")
    println("Long Data type: $longType")
    println("Float Data type: $floatType")
    println("Double Data type: $doubleType")
    println("Char Type: $charType")
    println("String Type: $strType")
}