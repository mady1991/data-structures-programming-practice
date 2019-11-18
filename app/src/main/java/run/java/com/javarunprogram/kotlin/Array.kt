package run.java.com.javarunprogram.kotlin

import java.util.*

// we can define array in two ways
//1. by arrayOf in which we can similar type or di similar value
//2. by Array in which gives length of array and intillise value

fun main() {

    //similar type
    val arrayInt = intArrayOf(1, 23, 3, 4);
    val arrayDouble = doubleArrayOf(1.0, 23.0, 3.0, 4.0);
    val arrayByte = byteArrayOf(1, 23, 3, 4);
    // all type array
    val arrayString = arrayOf("1", "23", 3.0, 4f, true, 'a');
    val anotherWayToInitializer = arrayOf(Integer(2), Integer(2));
    println(Arrays.toString(arrayString))

    //array intillazation
    var arrayByArray = Array(5, { i -> i + 1 });

    //travsing array
    for (item in arrayByArray) {
        println(item)
    }

    for (i in 0..arrayByArray.size - 1) {
        println(arrayByArray.get(i))
    }
    //using set and get for array
    arrayString[1] = "" + 23;
    //another way set
    arrayString.set(1, "Ram");
    println(Arrays.toString(anotherWayToInitializer))


}