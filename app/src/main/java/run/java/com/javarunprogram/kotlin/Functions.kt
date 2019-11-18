package run.java.com.javarunprogram.kotlin

fun main() {
    val min = Math.min(2, 23);
    println("min between 2 & 23 is $min")
    val max = Math.max(2, 23);
    println("max between 2 & 23 is $max")
    val result = Math.sqrt(23 + 2.0);
    println("Sqare of 25 is $result")
    val power = Math.pow(2.0, 4.0);
    println("2 to power 2 is " + power)

    println("is my methd is correcrt? $" + checkMyMethod(1, ""))

    println("Recussrion of 5 is " + recursion(5))

    runed(4, "hh")
    runed(s = "Sita")

    println("Higher Fuction")
//these below are hiher function which take function as input
    val fn: (String, String) -> String = { org, portal -> "$org develop $portal" }
    val fnn: (String, Int, Int) -> Int = { string, int, inta -> Integer.parseInt(string) + int + inta }
    HigherFunction("10", 10, 10, fnn)


}

fun HigherFunction(string: String, int: Int, inta: Int, fn: (String, Int, Int) -> Int): Unit {
    val result = fn(string, int, inta)
    print(result)
}

fun runed(i: Int = 5, s: String = "Ram") {
    println("int i is $i & String s is $s")

}

fun recursion(i: Int): Int {
    if (i == 0 || i == 1) {
        return 1;
    }
    return i + recursion(i - 1)
}

fun checkMyMethod(i: Int, s: String): Boolean {
    if (i is Int && s is String) return true else return false

}
