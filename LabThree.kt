package com.iti.intake40.kotlindemo

class Complex {
    var real: Int = 0
    var img: Int = 0

    fun doOperation(c: Complex, operation: (Complex, Complex) -> Complex): Complex =
        operation(this, c)

    fun printComplex() {
        var i = when (this.img) {
            1 -> "+i"
            -1 -> "-i"
            0 -> "i"
            in (1..Int.MAX_VALUE) -> ("+${this.img}i")//this.img.toString() + "+i"
            in (Int.MIN_VALUE until -2) -> ("${this.img}i")//this.img.toString() + "i"
            else -> ""
        }

        var r = when (this.real) {
            0 -> ""
            in (Int.MIN_VALUE..Int.MAX_VALUE) -> this.real.toString()
            else -> ""
        }
        println("$r$i")
    }

    infix fun printComplex(c: Complex) {
        c.printComplex()
    }
}

fun main() {
    val c1 = Complex()
    with(c1) {
        real = 4
        img = 6
    }
    val c2 = Complex()
    with(c2) {
        real = -4
        img = -9
    }

    val sum = c1.doOperation(c2) { x: Complex, y: Complex ->
        val temp = Complex()
        with(temp) {
            real = x.real + y.real
            img = x.img + y.img
        }
        temp
    }

    sum.printComplex()
    Complex().printComplex(sum)
}