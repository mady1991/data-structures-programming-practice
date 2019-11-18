package run.java.com.javarunprogram.kotlin.collection.mutable

class ArrayLists {

    fun giveArrayList(): ArrayList<Int> {
        val arrayList = ArrayList<Int>()
        for (i in 1..10) {
            arrayList.add(i)
        }
        return arrayList
    }

    fun myArrayList(int: Int) {
        var arrayList = ArrayList<Int>()
        when (int) {
            1 -> {
                for (i in 1..10) {
                    arrayList.add(i)
                }
                println("after add-->" + arrayList)
            }
            2 -> {
                arrayList = giveArrayList()
                for (element in arrayList) {
                    print(" " + element)
                }
            }
            3 -> {
                arrayList = giveArrayList()
                arrayList.add(1, 12)
                println(arrayList)
            }

            4 -> {
                arrayList = giveArrayList()
                println("Index --->" + arrayList.lastIndexOf(2))
            }

            5 -> {
                arrayList = giveArrayList()
                println(arrayList)
                arrayList.remove(4)
                println("Remove singgle -->" + arrayList)
                arrayList.removeAt(4)
                println("Remove singgle -->" + arrayList)

            }
        }
    }

    fun arrayListOf() {
        //funaction of ArrayListExample which will give same arrayList
        val arralistOf = arrayListOf<Int>()
        arralistOf.add(12)
        arralistOf.removeAt(12)
        arralistOf.addAll(arralistOf)
    }

}

fun main() {
    val arrayList = ArrayLists()
    arrayList.myArrayList(4)
    arrayList.arrayListOf()
}