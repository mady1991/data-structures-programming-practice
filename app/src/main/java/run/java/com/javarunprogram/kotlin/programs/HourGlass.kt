package run.java.com.javarunprogram.kotlin.programs


fun hourGlass(a: Array<Array<Int>>): Int {
    var max = Int.MAX_VALUE

    for (i in 0..3) {
        for (j in 0..3) {
            max = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] +
                    a[i + 2][j] + a[i + 2][j + 1] + a[i + 2][j + 2]

        }
    }

    return max
}

fun main() {
    val arr = arrayOf(
        arrayOf(1, 1, 1, 0, 0, 0),
        arrayOf(0, 1, 0, 0, 0, 0),
        arrayOf(1, 1, 1, 0, 0, 0),
        arrayOf(0, 0, 2, 4, 4, 0),
        arrayOf(0, 0, 0, 2, 0, 0),
        arrayOf(0, 0, 1, 2, 4, 0)
    )

    println(hourGlass(arr))
}