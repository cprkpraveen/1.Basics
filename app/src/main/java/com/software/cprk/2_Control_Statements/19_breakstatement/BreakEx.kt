package com.software.cprk.`2_Control_Statements`.`19_breakstatement`

fun main (args: Array<String>) {
    var i = 0
    loop@ while (i<5) {
        var x = 0
        while (x < 10){
            if (x==4) {
                //break;
                break@loop
            }
            println("i is $i and x is $x")
            x++
        }
        i++
    }
}
/*
Output:-
--------
i is 0 and x is 0
i is 0 and x is 1
i is 0 and x is 2
i is 0 and x is 3
 */