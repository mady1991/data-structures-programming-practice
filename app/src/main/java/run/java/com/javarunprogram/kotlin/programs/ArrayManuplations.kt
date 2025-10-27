package run.java.com.javarunprogram.kotlin.programs

fun main() {
//    val n = 10
//    val queries = arrayOf(arrayOf(1, 5, 3), arrayOf(4, 8, 7), arrayOf(6, 9, 1))
    val n = 5
    val queries = arrayOf(arrayOf(1, 2, 100), arrayOf(2, 5, 100), arrayOf(3, 4, 100))

    val result = arrayManipulation(n, queries)
    println(result)
}

fun arrayManipulation(n: Int, queries: Array<Array<Int>>): Long {
    val result = LongArray(n + 1)

    for (query in queries) {
        val a = query[0]
        val b = query[1]
        val k = query[2].toLong()
        result[a - 1] += k
        if (b < n) result[b] -= k
    }

    var maxValue = Long.MIN_VALUE
    var current = 0L
    for (i in 0 until n) {
        current += result[i]
        if (current > maxValue) maxValue = current
    }

    return maxValue


}