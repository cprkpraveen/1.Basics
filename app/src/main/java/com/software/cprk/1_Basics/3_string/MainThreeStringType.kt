package com.software.cprk.`1_Basics`.`3_string`

fun main(args : Array<String>){
    var strType : String = "Hello everyone"

    println("=====================================")
    println("This Session is explain about:: $strType")
    println("The length of this String is: ${strType.length}")
    println("The get value through index of this String is: ${strType.get(7)}")
    println("The compareTo of this String is: ${strType.compareTo("Hello everyone")}") //Both are same '0'
    println("The compareTo of this String is: ${strType.compareTo("everyone")}") // Both are different comparision, It prints '-29'

    strType = "Hello everyone. Welcome to our Kotlin World Programming."

    println("==============AFTER SOME CHANGES STRING=======================")
    println("After changes of String is: $strType")
    println("The length of this String is: ${strType.length}")
    println("The length of this String is: ${strType.get(16)}")
}