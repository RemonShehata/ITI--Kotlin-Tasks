package com.iti.intake40.kotlindemo

//region interface
interface hasArea {
    val name: String
    var width: Double
    var height: Double

    fun calculateArea(): Double
}
//endregion

//region shape class
abstract class Shape : hasArea {
    override fun calculateArea(): Double {
        println("Generic shape calculate area method")
        return width * height
    }
}
//endregion

//region circle
class circle : Shape() {
    override val name: String = "Circle"

    override var width: Double = 0.0
    override var height: Double = 0.0
    override fun calculateArea() = 2 * width * 3.14
}
//endregion

//region rectangle
class Rectangle(
    override val name: String,
    override var width: Double,
    override var height: Double
) :
    Shape() {
    override fun calculateArea() = width * height
}
//endregion

fun main() {
    val obj: hasArea = Rectangle("my rect", 50.25, 25.5)
    println(obj.calculateArea())
}