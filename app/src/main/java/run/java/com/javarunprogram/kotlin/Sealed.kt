package run.java.com.javarunprogram.kotlin

sealed class Shape<T>(age: T) {
    open fun draw() {

    }

    var age: T = age

    init {
        this.age = age
        when (age) {
            (age is Short) -> println("Short")
            (age is Int) -> println("Int")
            (age is Boolean) -> println("Boolean")
            (age is String) -> println("String")
            else -> println("Koi Type nhi hai")

        }

    }

    open class Circle(int: Int) : Shape<Int>(int) {
        override fun draw() {
            println("Drawing Circle")
        }

    }

    class Square(string: String) : Shape<String>(string) {
        override fun draw() {
            println("Drawing Sqaure")
        }
    }

    class Rectanle(boolean: Boolean) : Shape<Boolean>(boolean) {
        override fun draw() {
            println("Drawing Rectangle")
        }
    }
}

class Oval(short: Short) : Shape<Short>(short) {
    fun Shape<Short>.myFun() {
        println("Extension Funaction")
    }

    override fun draw() {
        println("Drawing Oval")
    }
}

fun main() {
    val oval = Oval(1)
    oval.draw()
    val rectangle = Shape.Rectanle(true)
    rectangle.draw()
    val square = Shape.Square("String")
    square.draw()
    val cicle = Shape.Circle(12)
    cicle.draw()

}






