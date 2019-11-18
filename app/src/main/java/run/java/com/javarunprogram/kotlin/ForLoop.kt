package run.java.com.javarunprogram.kotlin

fun main() {

    val array = arrayOf("Hari", true, false, 34, 23, 23.00, 23f)

/*
    //as a for loop
    for (item in array)
        print(" " + item + " ")
//as a index
    for (item in array.indices)
        println("array[$item] " + array[item])
*/

    // iterate in range
    for (i in 1..10) {
        print(i)//print 1 to 10
    }

    for (i in 10..1 step 2) {
        print(i)//print nothing
    }


    for (i in 6 downTo 0 step 2)
        print(" " + array.get(i))

}