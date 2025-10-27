package run.java.com.javarunprogram.kotlin

class CompainionClass {

    companion object CompainionClass {
        fun getBongs(nTimes: Int) {
            repeat(nTimes) { print("BONG ") }
        }
    }
}

fun main() {
    CompainionClass.getBongs(5)
}


