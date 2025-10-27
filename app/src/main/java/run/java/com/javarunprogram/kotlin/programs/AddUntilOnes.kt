package run.java.com.javarunprogram.kotlin.programs

fun main() {

    val list = mutableListOf(9, 9, 9, 9)

    var sum = 0
    var carry = 1
    for (i in list.size - 1 downTo 0) {
        sum += list[i] + carry
        carry = if (sum > 9) 1 else 0
        list[i] = sum % 10
        sum = 0

        if (carry == 1 && i == 0) {
            list.add(0, carry)
        }
    }
    println(list)


}