package run.java.com.javarunprogram.kotlin.collection.mutable

class MutableLists {

    fun myMutableList(int: Int) {
        val mutableList = mutableListOf(1, 2, 4, 5, 5, 5, true, false, "ram", 'a', 12f, 12.0)

        when (int) {
            1 -> {
                println("whats at index 3--->" + mutableList.get(3))
            }
            2 -> {
                println("before--->" + mutableList)
                println(mutableList.add("dd"))
                println("after add--->" + mutableList)
            }
            3 -> {
                //add all
                println("before--->" + mutableList)
                println(mutableList.addAll(mutableListOf<String>("12,23,45")))
                println("after add--->" + mutableList)
            }
            4 -> {
                //add all
                println("before--->" + mutableList)
                println(mutableList.addAll(0, mutableListOf<String>("12,23,45")))
                println("after add--->" + mutableList)
            }
            5 -> {

                println("List iterator--->")
                val listIterator = mutableList.listIterator()
                while (listIterator.hasNext()) {
                    print(" " + listIterator.next())
                }
            }
            6 -> {
                //remove element
                println("before--->" + mutableList)
                println(mutableList.remove("ram"))
                println("after add--->" + mutableList)
            }
            7 -> {
                //remove index
                println("before--->" + mutableList)
                println(mutableList.removeAt(2))
                println("after add--->" + mutableList)
            }
            8 -> {
                //remove index
                println("before--->" + mutableList)
                println(mutableList.removeAll(mutableList))
                println("after removeAll--->" + mutableList)
            }
            9 -> {
                //remove index
                println("before--->" + mutableList)
                println(mutableList.retainAll(mutableList))
                println("after retainAll--->" + mutableList)
            }
            10 -> {
                //set
                println("before--->" + mutableList)
                println(mutableList.set(0, 34))
                println("after set--->" + mutableList)
            }


        }

    }

}

fun main() {
    MutableLists().myMutableList(10)
}