package run.java.com.javarunprogram.kotlin

fun main() {

    var i = 0;
    loop@ while (i < 5) {
        print(i)
        i++;
        if (i == 3) {
            println("")
            continue@loop
        }
        println("me rahu ya na rahu")

    }
//by Loop we can define which loop we want to terminate
    /*test@ for (i in 1..5) {
        for (j in 5 downTo 1) {
            println("i $i j $j")
            if (i == 3) {
                continue@test
            }
        }
    }*/


}