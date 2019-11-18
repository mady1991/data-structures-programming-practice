package run.java.com.javarunprogram.kotlin

fun main() {
    val myLamda: (Int) -> Unit = { s: Int -> print(s) }
    addSum(2, 3, myLamda)
}

fun addSum(i: Int, i1: Int, myLamda: (Int) -> Unit) {
    val add = i + i1;
    myLamda(add)
}
