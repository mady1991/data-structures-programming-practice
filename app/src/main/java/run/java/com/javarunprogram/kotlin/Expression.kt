package run.java.com.javarunprogram.kotlin

import java.util.*

fun printKaro(value: String) {
    println(value)
}

//when is used as switch but it is alos take value as String and Int only
fun main() {
    printKaro("You want to call method without Expression or With Expression ?" + "\nPlease choose with , without, multipleBranch, range & multiple")
    val vale = readLine().toString()
    when (vale) {
        "with" -> whenWithExpression()
        "without" -> whenWithoutExpression()
        "multiple" -> whenWithMultipleStatement()
        "multipleBranch" -> whenMultipleBranches()
        "range" -> whenWithRange()

    }

}

fun whenWithRange() {
    val range = Integer.parseInt(readLine())
    when (range) {
        in 1..10 -> printKaro("In between 1 to 10")
        in 11..20 -> printKaro("In between 11 to 20")
        in 21..30 -> printKaro("In between 21 to 30")

    }
    val rangeABC = readLine().toString()
    when (rangeABC) {
        in "a".."k" -> printKaro("in between a to k")
        in "l".."z" -> printKaro("in between L to Z")
    }
}

fun whenMultipleBranches() {
    printKaro("Please enter name of the charcter of Ramayan, Mahabharat & DDLJ ")
    val charchter = readLine().toString();
    when (charchter.toLowerCase()) {
        "ram", "sita", "laxman", "bharat" -> printKaro("RAMAYAN")
        "arjun", "bhim", "duryodhan", "nakul", "bharat" -> printKaro("MAHABHARAT")
        "babuji", "simran", "rahul" -> printKaro("DDLJ")
    }
}

fun whenWithMultipleStatement() {
    printKaro("Please Enter the value between 1 to 4 to convert int to String")
    val value = Integer.valueOf(readLine())
    when (value) {
        1 -> {
            printKaro("One")
            printKaro("First Integer value")
        }
        2 -> {
            printKaro("Two")
            printKaro("second Integer value")
        }
        3 -> {
            printKaro("Three")
            printKaro("third Integer value")
        }
        4 -> {
            printKaro("Four")
            printKaro("fourth Integer value")
        }

        else -> {
            printKaro("Invalid Number")
            printKaro("Please between only 1 to 4")
        }
    }
}

fun whenWithoutExpression() {
    printKaro("Please Enter the value between 1 to 4 to convert int to String")
    val value = Integer.valueOf(readLine())
    when (value) {
        1 -> printKaro("One")
        2 -> printKaro("Two")
        3 -> printKaro("Three")
        4 -> printKaro("Four")

        else -> printKaro("Invalid Number")
    }
}

fun whenWithExpression() {
    val scanner = Scanner(System.`in`);
    printKaro("Please Enter the value between One to Four to convert String to Int")
    val value = scanner.next()

    val argument = when (value.toLowerCase()) {
        "one" -> 1
        "two" -> 2
        "three" -> 3
        "four" -> 4
        else -> printKaro("Invalid Number")
    }

    printKaro(argument.toString())
}

