package run.java.com.javarunprogram.kotlin

class Ranges {

    fun range(min: Int, max: Int) {
        for (x in min..max) {
            println(x)
        }
    }

    fun rangeToo(min: Int, max: Int) {
        for (x in min.rangeTo(max)) {
            println(x)
        }
    }

    fun rangeToDown(min: Int, max: Int) {
        for (x in max downTo min) {
            println(x)
        }
    }

    fun rangeStep(min: Int, max: Int) {
        for (x in min..max step 2) {
            println(x)
        }
    }

    fun rangeUntil(min: Int, max: Int) {
        for (x in min until max) {
            println(x)
        }
    }

    fun rangeReversed(min: Int, max: Int) {

        for (x in (min..max).reversed()) {
            println(x)
        }
    }


}

fun main() {
    Ranges().rangeReversed(1, 10)//not print last index
}