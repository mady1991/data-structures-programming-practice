package run.java.com.javarunprogram.kotlin.collection.immutable

class Lists {

    fun myList() {
        //List of as any type of data
        val list = listOf("ram", "sham", "mohan", "Moga", "hjh", "dfg", "12", "1234", 89)
        //Only String
        val listString: List<String> = listOf("ram", "sham", "mohan", "Moga", "hjh", "dfg", "12", "1234")
        println(list)
        println("get-->" + list.get(0))
        println("index-->" + list.indexOf("ram"))
        println("lastindex-->" + list.lastIndexOf("mohan"))
        println("contain-->" + list.contains("mohan"))
        println("sublist-->" + list.subList(0, 3))
        println("drop-->" + list.drop(2))
        println("dropLast-->" + list.dropLast(0))

    }
}


fun main() {
    val list = Lists()
    list.myList()

}
