package com.iti.intake40.kotlindemo

fun main() {
    doTaskFourB()
}

fun doTaskOne() {
    println("Enter your name: ")
    val name = readLine()
    val userName = if (name.isNullOrBlank()) "anonymous" else name
    print("hello, $userName")
}

fun doTaskTwo() {
    val numbers = mutableListOf<Int>()
    for (i in 1..100) {
        val random = (0..100).random()
        numbers.add(random)
    }

    for (number in numbers.filter { it <= 10 }) {
        print("$number  ")
    }
}

fun doTaskThree() {
    print("enter the first operator: ")
    val first: Int? = readLine()?.toIntOrNull() ?: 0
    print("enter operand: ")
    val op: Char? = readLine()?.singleOrNull()
    print("enter the second operator: ")
    val second: Int? = readLine()?.toIntOrNull() ?: 0

    var result = when (op) {
        '+' -> first?.plus(second!!)
        '-' -> first?.minus(second!!)
        '*' -> first?.times(second!!)
        '/' -> first?.div(second!!)

        else -> "wrong operation"
    }

    println("$first $op $second = $result")
}

fun doTaskFourA() {
    for (i in 0..5) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }

    /*
    for (i in 0..5) {
        var j = 1
        while (j < i) {
            print("*")
            j++
        }
        println()
    }
     */
}

fun doTaskFourB() {
    val rows = 5
    var k = 0

    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }

        while (k != 2 * i - 1) {
            print("* ")
            k++
        }

        println()
        k = 0
    }
}