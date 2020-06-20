package com.software.cprk.`3_Functions`.`21_basicfunctions`

fun main(args: Array<String>) {
    var fibanaci = Fibanasci()
    fibanaci.fibonacci(8)
}

class Fibanasci {
    fun fibonacci(limit: Int) {
        var prev = 0
        var prevprev = 0
        var current = 1
        for (i: Int in 1..limit) {
            println(current)
            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}
