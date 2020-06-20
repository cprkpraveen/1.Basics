package com.software.cprk.`1_Basics`.`11_bitwiseoperators`

fun main (args: Array<String>) {

    /*
        ---------------
        Bitwise Operators
        ---------------
     */

    //  128  64  32  16  8   4   2   1
    //  0    1   0   1   0   1   0   0
    var x = 84

    // Shift Left
    //  128  64  32  16  8   4   2   1
    //  1    0   1   0   1   0   0   0
    println(x.shl(1))

    // Shift Right
    //  128  64  32  16  8   4   2   1
    //  0    0   1   0   1   0   1   0
    println(x.shr(1))

    var num1 = 78
    var num2 = 118

    // Bitwise AND
    //  128  64  32  16  8   4   2   1
    //  0    1   0   0   1   1   1   0 - 78
    //  0    1   1   1   0   1   1   0 - 118
    //  ------------------------------
    //  0    1   0   0   0   1   1   0 - 70
    println(num1.and(num2))

    // Bitwise OR
    //  128  64  32  16  8   4   2   1
    //  0    1   0   0   1   1   1   0 - 78
    //  0    1   1   1   0   1   1   0 - 118
    //  ------------------------------
    //  0    1   1   1   1   1   1   0 - 126
    println(num1.or(num2))

    // Bitwise XOR (exclusive or)
    //  128  64  32  16  8   4   2   1
    //  0    1   0   0   1   1   1   0 - 78
    //  0    1   1   1   0   1   1   0 - 118
    //  ------------------------------
    //  0    0   1   1   1   0   0   0 - 56
    println(num1.xor(num2))

    // Bitwise Inverse
    //  128  64  32  16  8   4   2   1
    //  0    1   0   0   1   1   1   0 - 78
    //  ------------------------------
    println(num1.inv())
}