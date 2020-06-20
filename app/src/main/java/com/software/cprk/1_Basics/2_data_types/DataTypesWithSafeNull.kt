package com.software.cprk.`1_Basics`.`2_data_types`
fun main(args : Array<String>) {
    var byteType : Byte ? = null
    var shortType : Short ? = null
    var intType : Int ? = null
    var longType : Long ? = null
    var floatType : Float ? = null
    var doubleType : Double ? = null
    var charType : Char ? = null
    var strType : String ? = null

    byteType = -128
    shortType = -32768
    intType = 10
    longType = 1234567890123456789
    floatType = 25.65f
    doubleType = 25266.65
    charType = 'A'
    strType = "Kotlin Data Types"

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