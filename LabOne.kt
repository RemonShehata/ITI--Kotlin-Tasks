package com.iti.intake40.kotlindemo

fun main() {
    // region  task1
    println("Enter your name: ")
    val name = readLine()
    val userName = if (name.isNullOrBlank()) "anonymous" else name
    print("hello, $userName")

    //endregion
}