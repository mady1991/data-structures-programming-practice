package run.java.com.javarunprogram.kotlin.programs

import java.util.Arrays


fun matchingStrings(stringList: Array<String>, queries: Array<String>): Array<Int> {
    // Write your code here
    val result = Array(queries.size) { 0 }

    for (i in queries.indices) {

        for (j in stringList.indices) {
            if (queries[i] == stringList[j]) {
                result[i]++
            }
        }

    }
    return result;
}


fun main() {
    val stringList = arrayOf("ab", "ab", "abc")
    val queries = arrayOf("ab", "abc", "bc")
    val result = matchingStrings(stringList, queries)
    println(Arrays.toString(result))

}