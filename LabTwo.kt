package com.iti.intake40.kotlindemo

fun main() {
    solveTaskOne()
}

fun solveTaskOne() {
    val data = mapOf(
        "user1" to listOf(32, 54, 17, -1, 34),
        "user2" to listOf(19, -1, 67, 22),
        "user3" to listOf(),
        "user4" to listOf(65, 32, 18, 44)
    )

    //val users = data.map { it }
    val ages = data.flatMap { it.value }
    val names = data.map { it.key }
    val validAges = ages.filter { it > 0}
    val invalidAges = ages.filter { it < 0 }

    var sum = 0
    for (age in validAges){
        sum += age
    }
    val avg = sum / validAges.size

    //todo get users with faulty data
    //val faultyUsers = data.map { it.key }.filter { it < 0 }

    //println("users $users")
    println("ages $ages")
    println("names $names")
    println("valid ages: $validAges")
    println("average age = $avg")
    println("invalid ages: $invalidAges")
}
