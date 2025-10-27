package run.java.com.javarunprogram.kotlin.programs

import java.util.Arrays


fun main() {
    val arr = arrayOf(1, 2, 3, 4, 5)
    val d = 2
    val rotatedArray = rotateLeft(arr.size - 1 - d, arr)// always remeber that step should always minus from array length -1
    println(Arrays.toString(rotatedArray))
}


fun rotateLeft(d: Int, arr: Array<Int>): Array<Int> {
    rotate(0, arr.size - 1, arr)
    rotate(0, d, arr)
    rotate(d + 1, arr.size - 1, arr)
    return arr
}


fun rotate(low: Int, high: Int, arr: Array<Int>) {
    var low = low
    var high = high
    while (low < high) {
        val temp = arr[low]
        arr[low] = arr[high]
        arr[high] = temp
        low++
        high--
    }
}