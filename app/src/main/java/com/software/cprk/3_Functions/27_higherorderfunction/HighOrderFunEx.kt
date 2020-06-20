package com.software.cprk.`3_Functions`.`27_higherorderfunction`

fun main (args: Array<String>) {
    var fn:(Int, Int) -> Int = {num1, num2->num1 * num2}
    epicFunction(5,9,fn)
}

fun epicFunction(num1: Int, num2: Int, fn: (Int, Int) -> Int) {
    var result = fn(num1,num2)
    print(result)
}
