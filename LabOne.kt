package com.iti.intake40.kotlindemo

fun main() {
    doTaskTwo()
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