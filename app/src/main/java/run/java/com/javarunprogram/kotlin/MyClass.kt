package run.java.com.javarunprogram.kotlin

interface Bird {

    fun fly() {
        println("Parrot is flying")
    }

    fun swim()
}

abstract class Yoo(int: Int) {

    constructor(int: Int, string: String) : this(int) {
        println("in abstarct constructer")
    }

    open fun myName() {
        println("My Name toh hai par btau hi kyu")
    }


}

class Yooo(int: Int) {

    constructor(int: Int, string: String) : this(int) {
        println("in abstarct constructer")
    }

    open fun myName() {
        println("My Name toh hai par btau hi kyu")
    }


}

open class MyClass : Yoo {

    open fun fly() {
        println("Bird are fyling")
    }

    var name: String? = null
    protected var lastName: String? = null

    constructor(name: String, lastName: String) : super(2) {

        this.name = name;
        this.lastName = lastName

        println("First " + myName())
    }

    open override fun myName() {
        super.myName()
        println("My Name is $name $lastName")
    }

    internal open fun myFun(int: Int): String {
        println("Super")
        return ""
    }


}

class BaseClass : MyClass, Bird {
    override fun swim() {

    }

    override fun fly() {
        super<Bird>.fly()
        super<MyClass>.fly()
        println("Humu chale hain")
    }

    constructor(name: String, lastName: String) : super(name, lastName) {
        println("second " + myName())
    }

    override fun myFun(int: Int): String {
        println("Base")
        return ""
    }

    override fun myName() {
        super.myName()
        println("Base ko bhi name hai")
    }


    fun add(a: Int, b: Int) {

        println("Sum is -->" + (a + b))
    }
}

fun main() {
    val baseClass = BaseClass("narender", "kumar")
    baseClass.fly()

    val user = User(1, "Narender", "Kumar")
    println(user.id + 1)
}