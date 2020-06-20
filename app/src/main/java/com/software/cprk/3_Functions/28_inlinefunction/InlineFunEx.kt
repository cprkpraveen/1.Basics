package com.software.cprk.`3_Functions`.`28_inlinefunction`

fun main (args: Array<String>) {
    inlineFunc({ println("Epic Call")})
}

fun inlineFunc(myFun: () -> Unit) {
    myFun()
    println("Code inside this epic inline function")
}
