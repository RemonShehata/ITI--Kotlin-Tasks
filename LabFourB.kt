package com.iti.intake40.kotlindemo

class NewComplex(var real: Int, var img: Int) {

    companion object {
        fun doOperationOnComplex(
            c1: NewComplex,
            c2: NewComplex,
            lamda: (NewComplex, NewComplex) -> NewComplex
        ): NewComplex =
            lamda(c1, c2)

        fun printNewComplex(c: NewComplex) {
            c.printNewComplex()
        }

    }

    fun printNewComplex() {
        var i = when (this.img) {
            1 -> "+i"
            -1 -> "-i"
            0 -> "i"
            in (1..Int.MAX_VALUE) -> ("+${this.img}i")
            in (Int.MIN_VALUE until -2) -> ("${this.img}i")
            else -> ""
        }

        var r = when (this.real) {
            0 -> ""
            in (Int.MIN_VALUE..Int.MAX_VALUE) -> this.real.toString()
            else -> ""
        }
        println("$r$i")
    }
}

fun main() {

    var c1 = NewComplex(10, 15)
    var c2 = NewComplex(5, 10)
    val sum = NewComplex.doOperationOnComplex(c1, c2) { c1, c2 ->
        val result = NewComplex(c1.real + c2.real, c2.img + c2.img)

        result
    }


    val sub = NewComplex.doOperationOnComplex(c1, c2) { x, y ->
        NewComplex(x.real - y.real, x.img - y.img)
    }

    NewComplex.printNewComplex(sum)
    NewComplex.printNewComplex(sub)
}