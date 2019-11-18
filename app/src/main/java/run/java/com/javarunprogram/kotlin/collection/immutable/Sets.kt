package run.java.com.javarunprogram.kotlin.collection.immutable

class Sets {


    fun mySet(int: Int) {
        val set = setOf<Any>(12, 32, 33, 5, 5, 0, 6, -2)
        when (int) {
            1 -> {
                println("Contaions 6-->" + set.contains(6))
                val set2 = setOf(set)
                println("Contaions 6-->" + set.containsAll(set2))
                println("isEmpty-->" + set.isEmpty())
                println("isNONEmpty-->" + set.isNotEmpty())

            }
            2 -> {
                //iteration
                for (itr in set.iterator()) {
                    print(" " + itr)
                }

            }
            3 -> {
                println(set)
                println(set.reversed())
                println("Drop-->" + set.drop(1))
                println("Element at-->" + set.elementAt(2))
                println("Element atOrNull-->" + set.elementAtOrNull(8))
                println("ElementAt OrElse-->" + set.elementAtOrElse(3) { 12 })
                println("Distinct-->" + set.distinct())
                println("Distinct-->" + set.findLast { w -> w.equals(33) })
                println("First-->" + set.first())
                println("Last-->" + set.lastOrNull())
                println(set union setOf(3, 12))
                println(set intersect setOf(3, 12))
                println(set subtract setOf(3, 12))
            }
            4 -> {
                fun greater(x: Int) = x >= 12
                val list = listOf<Int>(1, 2, 44, 5, 2)
                println(list.filter(::greater))
            }
        }
    }
}

fun main() {
    val set = Sets()
    set.mySet(4)
    val set2 = Sets::class
    println("Same or not" + set.equals(set2))


}