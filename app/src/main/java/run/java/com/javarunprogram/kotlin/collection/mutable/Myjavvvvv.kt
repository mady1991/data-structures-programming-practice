package run.java.com.javarunprogram.kotlin.collection.mutable

import java.util.HashMap

fun main(){
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