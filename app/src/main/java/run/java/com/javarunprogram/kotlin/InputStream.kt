package run.java.com.javarunprogram.kotlin

import java.util.*

fun main() {

    //used for print data in next line
    println("Enter your name")
    //by Scanner we can get input value
    val sacnner = Scanner(System.`in`)
    val name = sacnner.nextDouble()
    //Direct from ReadLine we can take value and dont need to cast into any type
    println("Enter your age")
    var age: Int = Integer.valueOf(readLine())
    println("Your name is $name and your age is $age")
}