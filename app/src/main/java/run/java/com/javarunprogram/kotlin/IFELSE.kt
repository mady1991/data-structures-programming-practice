package run.java.com.javarunprogram.kotlin

fun main() {
    val a = 8
    val b = -8
    // if curly barces
    var result = if (a > b) {
        "$a is postive"
    } else {
        "$b is postive"
    }

    println(result)

    //without curly braces //inline statement
    //nested if else
    result = if (a > b) if (a == b) "both are equal" else if (a != b) "not equal" else "ddddd" else "mera hai"
    print(result)
}