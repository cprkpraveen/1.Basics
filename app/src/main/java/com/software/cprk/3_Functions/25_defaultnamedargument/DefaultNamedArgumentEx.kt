package com.software.cprk.`3_Functions`.`25_defaultnamedargument`

fun main (args: Array<String>) {
 add(5, 8)
 add(5)
 add()
  epicFunction('i', 65)
  epicFunction(number = 60)
  epicFunction()
}

fun epicFunction(letter: Char = 'a', number: Int = 9) {
    println("$letter and $number")
}

fun add(i: Int=1, i1: Int=1) {

    println(i + i1)
}

