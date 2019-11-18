package run.java.com.javarunprogram.kotlin

//val is immutable means cant change value after intillation

//var is mutable means can change value after intillation
//this gives no error
var aa = 0;//null
//both comment value gives error
val a = null;//0

fun main() {
    val valnVar = ValnVar(8)
    println(valnVar.name)
    valnVar.Nested(0, "Kya print karega ree").printKarneJarRhaHu()

}

class ValnVar(o: Int) {
    var acc_no: Int? = 0
    var name: String? = null
    var amount = 0f

    init {
        name = "Narender"
        amount = 1000f

        add()
    }

    fun add() {
        println(name + amount)
    }

    fun deposit() {

    }

    fun withdraw() {

    }

    fun checkAmmount() {

    }

    inner class Nested constructor(int: Int, String: String) {
        val java = String

        fun printKarneJarRhaHu() {
            print(java)
        }
    }


}
