package com.software.cprk.`1_Basics`.`3_string`

fun main (args : Array<String>) {
    var name : String = "kotlin"
    var programmingLang : String = " Programming Language"
    var result : String ? = null
    //Concatenations of Both Strings with help of plus function in kotlin, instead of concat() from java
    result = name.plus(programmingLang)
    print(" Both Strings are : ${result}") // Kotlin Programming Language

    result = name[2].toString()
    println("The 2nd  index of String is: $result") //t

    //Capitaloization of String content i.e, 1st letter is capitalize from word. let's see
    name = "kotlin program"
    result = name.capitalize()
    println("Capitalize()--> $result") //Kotlin program

    //Length of the String
    result = name.length.toString()
    println("Length is: $result") // 14
    result = name.decapitalize()
    println("Decapitalize : $result")//kotlin program

    //Drop of String with help of index. i.e. we got string after drop of specified index
    //ie. Returns a string with the first [n] characters removed.
    result= name.drop(1)
    println("Drop : $result") //otlin program
    result= name.drop(3)
    println("Drop at index 3 : $result") // lin program

    //Returns a string with the last [n] characters removed.
    result = name.dropLast(4)
    println("DropLast : $result")

    result = name.dropLastWhile { it.isLetter() }
    println("DropLastWhile : $result") //kotlin

    result = name.dropWhile { it.isLetter() }
    println("DropWhile : $result") //program

    //Returns `true` if this character is a letter or digit.
    result = name.filter { it.isLetterOrDigit() }
    println("filter.isLetterOrDigit : $result " )//kotlinprogram

    result = name.filter { it.isDefined() }
    println("isDefined : $result") // kotlin program
}