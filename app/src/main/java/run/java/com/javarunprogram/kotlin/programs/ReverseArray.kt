package run.java.com.javarunprogram.kotlin.programs

import java.util.Arrays


fun main() {
    //2 1 4 3
    val a = arrayOf(1, 4, 3, 2)

    for (index in 0 until a.size / 2) {
        val temp = a[index]
        a[index] = a[a.size - index - 1]
        a[a.size - index - 1] = temp
    }
    println(Arrays.toString(a))


}
