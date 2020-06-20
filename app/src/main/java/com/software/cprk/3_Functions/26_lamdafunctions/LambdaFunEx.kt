package com.software.cprk.`3_Functions`.`26_lamdafunctions`

fun main (args: Array<String>) {
    val lambda: (Int) -> Unit = {s: Int -> println(s)}
    multiply(4,5,lambda)
}

fun multiply(num1: Int, num2: Int, lambda: (Int) -> Unit) {
    val result = num1 * num2
    lambda(result)
}
