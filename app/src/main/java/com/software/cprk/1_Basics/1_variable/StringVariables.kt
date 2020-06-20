package com.software.cprk.`1_Basics`.`1_variable`

fun main(args : Array<String>) {
    var strName : String = "CPrk"
    val strSoftware : String = "Software"
    print("Name: ")
    println("$strName ${strSoftware}..")
    // Change variable name of String, It's possible here bcz the declaration type of variable of the String is 'var'
    strName = "Naveen"
    println("After changes name")
    println("Name : ${strName} ${strSoftware} ,")
    //Here we can declare variables with null safe
    var address : String ? = null
    address = "Plot No.103, Shakhare wasti road, Hinewadi, Pune"
    println("Address : $address")
}