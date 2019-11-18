package run.java.com.javarunprogram.kotlin.collection.mutable

class HashMapOf {
    // we can also define HashMap as hasMapOf
    fun getHashMap(): HashMap<Int, String> {
        //we can give initial capicity of mutable map but if we want add some data than it auto add more capicity
        //val hashMap = hashMapOf<Int, String>()
        val hashMap = HashMap<Int, String>(1)

        for (i in 1..10) {
            hashMap.put(i, "" + i + i)
        }
        hashMap.putAll(hashMap)

        return hashMap
    }

    fun myHashMap(value: Int) {
        val hashMap = getHashMap()
        when (value) {
            1 -> {
                println("Before-->" + hashMap)
                hashMap.put(1, "Ram")
                println("After-->" + hashMap)
            }
            2 -> {
                println("Index of 2" + hashMap.get(2))
                println("plus of index of 2 n 3--->" + (Integer.parseInt(hashMap.get(3)) + Integer.parseInt(hashMap.get(2))))
            }
            3 -> {
                println("4 Key is in may or not-->" + hashMap.containsKey(4))
                println("44 Value is in may or not-->" + hashMap.containsValue("44"))
            }
            4 -> {
                //iteration
                for (i in hashMap.iterator()) {
                    println("key-->" + i.key)
                    println("Value-->" + i.value)
                }

                for (itr in hashMap.asSequence()) {
                    println("itr--->" + itr + "\nkey-->" + itr.key + "\nValue-->" + itr.value)
                }
            }

            5 -> {
                println("before-->" + hashMap)
                println("remove-->" + hashMap.remove(1))
                println("after-->" + hashMap)
                println("Clear-->" + hashMap.clear())
                println(hashMap)
            }
            6 -> {
                println("All Keys-->" + hashMap.keys)
                println("All Values-->" + hashMap.values)
            }
        }
    }

}

fun main() {
    val hashMap = HashMapOf()
    hashMap.myHashMap(6)
}