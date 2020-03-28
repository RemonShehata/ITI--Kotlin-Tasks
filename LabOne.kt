package com.iti.intake40.kotlindemo

fun main() {
    doTaskThree()
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