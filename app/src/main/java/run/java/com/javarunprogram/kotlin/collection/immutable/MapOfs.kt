package run.java.com.javarunprogram.kotlin.collection.immutable

import java.util.*

class MapOfs {
    fun myMapOf(int: Int) {
        val myMap = mapOf(0 to "ram", 1 to "sita", 3 to "gita", 4 to "papita", 6 to "null")
        when (int) {
            in 1..2 -> {
                print("index-->" + myMap.get(0))

            }
            3 -> {
                println("key--->" + myMap.keys)
                println("value--->" + myMap.values)
            }
            4 -> {
                println("contaions--->" + myMap.contains(1))
                println("contaionkey--->" + myMap.containsKey(1))
                println("contaionvalue--->" + myMap.containsValue("yu"))
            }
            5 -> {
                val iterator = myMap.entries.iterator()
                while (iterator.hasNext()) {
                    print(" " + iterator.next().key)
                    print(" " + iterator.next().value)
                }
            }
            6 -> {
                myMap.getOrDefault(2, "Vijay")
                print(myMap)

            }
            7 -> {
                for (itr in myMap.asIterable()) {
                    println(" key-->" + itr.key)
                    println(" value-->" + itr.value)


                }

            }

            8 -> {
                for (itr in myMap.iterator()) {
                    println(" key-->" + itr.key)
                    println(" value-->" + itr.value)


                }

            }

            9 -> {
                println(myMap)
                for (i in myMap.minus(3)) {
                    println(myMap[i.key])
                }

            }
            10 -> {
                for (itr in myMap.plus(Pair(2, "Vijay DDE"))) {
                    println(" " + itr.value);
                    println(" " + itr.key);
                }

            }
        }

    }
}

fun main() {
    val myMap = MapOfs()
   // myMap.myMapOf(10)
    var hashmap = HashMap<String, String>()
    hashmap.put("AA", "Andaman")
    hashmap.put("Ab", "Swizerland")
    hashmap.put("Ab", "Aam")
    hashmap.put("Ad", "mayyu")
    hashmap.put("Af", "Nizam")
    val result = hashmap.toList().sortedBy { (_, value) -> value}.toMap()
    result.keys
    for (entry in result) {
        print("Key: " + entry.key)
        println(" Value: " + entry.value)
    }


}