package run.java.com.javarunprogram.kotlin

fun main() {
    // its basically array of char
    val charArray = charArrayOf('n', 'a', 'r', 'e', 'n', 'd', 'e', 'r')
    println(String(charArray))
    //String declaration
    var escapedString = "JavaToKotlin"
    val rawString = """Im A Bad
        |Bad Bad Bad
        |Bad Boy
    """.trimMargin()
    //concatenation
    escapedString = escapedString + "Android"
    escapedString.plus("Similar to swift")// wont add untill give not any refernece
    println("Length-->" + escapedString.length)
    println("indices-->" + escapedString.indices)
    println("lastIndex-->" + escapedString.lastIndex)

    //ComapareTo method
    println("Comapare value-->" + escapedString.compareTo(escapedString))// Gives ZERO means equal -1 means lesser 1 greater
    println("Equals Method-->" + escapedString.equals("JavaToKotlinandroid"))//print false becoz of ignore case
    println("Equals Ignore Method-->" + escapedString.equals("JavaToKotlinandroid", true))//print true
    println("== method -->")
    println(escapedString == "JavaToKotlinAndroid")//print true
    println("subSequenece--->" + escapedString.subSequence(0, 4))// print java
    println("Count--->" + escapedString.count())// print size
    println("Drop--->" + escapedString.drop(4))// print ToKotlinAndroid after removing Java
    println("DropLast--->" + escapedString.dropLast(4))// print JavaToKotlinAnd after removing roid
    val templateString = "Ram"
    println("Template String is -->${MyEscaped(templateString.plus("Sita"))}")

    println("""This is Raw String
        &This work Same
        &This is alos work same 
    """.trimMargin("&"))
    //check Reference of two string
    val st1 = buildString { "Name kya hai" }
    val st2 = buildString { "Name kya hai" }
    print("are they have same refernce -->"); println(st1 === st2)//print false both have different
    print("are they have same refernce -->"); println(st1 !== st2)//print true both have different
    //by this we can assign null to a reference
    var str: String? = "Hello"

    ///////Smart Cast////////////
    if (str != null) {
        println("Smart length-->" + str.length)
    }
    //another way to smart cast is
    if (str is String)
        println("Smart length-->" + str.length)

    //Unsafe cast
    var unsafe: Any? = 123
    val safeString: String? = unsafe as? String
    // for safe casting use as and than continue with ? so type cast will be safe
    val safeInt = unsafe as? Int
    println("Unsafe --->" + safeString)
    if (safeInt is Int) {
        println(safeInt + 123)
    }

    val elvis = "null"
    // Elvis opertor is basically used for type cast n it assue you that it will retun not null value
    val length = elvis?.length ?: -1
    println("Elvis opertor length-->$length")

}

fun MyEscaped(string: String): String {
    return string
}