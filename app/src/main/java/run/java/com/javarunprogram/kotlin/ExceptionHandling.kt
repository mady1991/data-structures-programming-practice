package run.java.com.javarunprogram.kotlin

fun main() {
    var dus = 10;
    try {
        dus = 10 / 0;
        print(dus)
    } catch (e: ArithmeticException) {
        dus = dus % 2
        print(dus)
    }

    println(StringToInt("10"))
    multiCatch()
    throwCustomException(12)
}

fun multiCatch() {
    //In Kotlin there is no hirearchy like in below example first call the Exception superClass
    try {
        val dus = 10 / 0
    } catch (e: NumberFormatException) {
        print("Number Formate" + e)
    } catch (e: Exception) {
        print("Exception" + e)
    } catch (e: ArithmeticException) {
        print("Exx[ection" + e)
    } finally {
        println("Rest Code ")
    }
}

fun throwCustomException(age: Int) {
    if (age < 18)
        throw ArithmeticException("Under Age")
    else
        printKaro("Adult")
}

fun StringToInt(str: String): Int {

    return try {
        Integer.parseInt(str)
    } catch (e: Exception) {
        0
    }
}