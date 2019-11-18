@file: JvmName("MyKotlinFILE")

package run.java.com.javarunprogram.kotlin

import run.java.com.javarunprogram.java.binarySearch
import run.java.com.javarunprogram.java.sorting.MyJava


class Interoperability {
    fun callBinaryClass() {
        val arry = arrayOf(12, 34, 89, 45, 23, 12, 3)
        arry.sort()
        println(binarySearch().binaery(arry.toIntArray(), 0, arry.size - 1, 12))

    }

    fun callIngMyJava() {
        val myJava = MyJava()

        myJava.setfirstName("FGHHH")
        myJava.setlastName("Kumarlk")
        myJava.firstName = "Narender"
        println(myJava.getfirstName())
        val array = intArrayOf(0, 1, 2, 3)
        myJava.display(*array)


    }
}

fun main() {
    Interoperability().callIngMyJava()

}


fun callBinaryClass() {
    print("KOTLINMUUUU")
}
