package run.java.com.javarunprogram.kotlin

class Regexs {

    fun MyRegex(int: Int) {
        val regex = Regex(pattern = "ko")
        when (int) {
            1 -> println(regex.containsMatchIn(input = "kotlin"))
            2 -> {
                val emailParttern = Regex("""\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,6}""")
                val email: String? = emailParttern.find("this is my email mymail@google.com")?.value
                println(email)
                val phoneNumber: String? = Regex(pattern = """\d{3}-\d{3}-\d{4}""")
                        .find("phone: 123-456-7890, e..")?.value
                println(phoneNumber)
            }

            3 -> {
                val foundResults = Regex("""\d+""").findAll("ab12cd34ef 56gh7 8i23_34")
                val result = StringBuilder()
                for (findText in foundResults) {
                    result.append(findText.value + " ")
                }
                println(result)
            }
            4 -> {
                val replace = Regex("Beautiful")
                val stringReplace = replace.replace("This Picture is Beautiful", "Awesome")
                val stringReplaceFirst = replace.replaceFirst("This Picture is Beautiful,This is Beautiful", "Awesome")
                println(stringReplace)
                println(stringReplaceFirst)

            }
            5 -> {
                val split = Regex("""\D+""").split("ab12cd34ef")
                val splitNothing = Regex("""\d+""").split("Split here nothing")
                val splitComma = Regex(""",""").split("ab,12cd,34,ef")
                val splitSplace = Regex("""\s""").split("ab 12cd 34,ef")

                println(split)
                println(splitNothing)
                println(splitComma)
                println(splitSplace)

            }
        }
    }
}

fun main() {
    Regexs().MyRegex(5)
}