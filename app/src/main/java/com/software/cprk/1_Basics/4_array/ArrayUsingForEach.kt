package com.software.cprk.`1_Basics`.`4_array`

fun main (args : Array<String>) {
    val arrayItem = arrayOf(1,3,5,7,9)
    // Performs the given [action] on each element.
    println("forEach instead of for-loop")
    arrayItem.forEach { println(it) }

    val names = arrayOf("Kotlin","Program", "language")
    /**Kotlin
    Program
    language*/
    println("forEach for string array elements")
    names.forEach { println(it) }
}