import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

//for running main function we simply need a main function without any class because its already in class
// main function have parameter like args:Array<String>
// we can declre main method with params or without params but if we define both than complier gives priority to with params method
// main method can private in Kotlin unlike java

fun main() {
    print("hello world\nI'm New in this not fresher one")

}

fun main(ars: Array<String>) {
    print("hello world\nI'm New in this not fresher one")

    val df2 = SimpleDateFormat("dd.mm.yyyy hh:mm")
    val df3 = SimpleDateFormat("dd MMMM yyyy,hh:mm")
    val eDate = "25.05.2018 14:13"
    val eDDte: Date
    try {
        eDDte = df2.parse(eDate)
        print("Date: " + df3.format(eDDte))
    } catch (e: ParseException) {
        e.printStackTrace()
    }


}


