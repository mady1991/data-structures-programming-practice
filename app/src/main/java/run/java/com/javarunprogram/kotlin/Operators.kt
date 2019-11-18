package run.java.com.javarunprogram.kotlin

//in division we have to divison in (a-b) other wont with String concatenation
//in Kotlin also perform BODMAS
//

fun main() {
    var a = 10;
    val b = 2;
    //aithamatic operation
    /*println("sum is :" + a + b)
    println("div is :" + (a - b))
    println("divide is :" + a / b)
    println("Mul is :" + a * b)
    println("remin is :" + a % b)*/

    //Relation Operator
    //<,>,<=,=>,==,!=
    if (a <= b) {
        println("less")
    } else {
        println("graeter")
    }

    //assihnment opertaor
    a /= b
    a += b
    a -= b
    a *= b
    println(a)

    var c = 2;
    //Unary Operator
    println("Unary Operator")
    println(" s" + +c)// print 3
    println(+c)// print 2
    println(-+c)// print -2
    println(-+c)// print -2
    c = 2;
    println("+a :" + +c)// print 2
    println("-b :" + -c)//print -2
    println("++a :" + ++c)// print 3
    println("--b :" + --c)//print 1
    val flag = true
    println("!flag :" + !flag)

    /**Bitwise Opertaor**/

     //shl mean shit left will always give just double value of that number like if you give 1.shl.(1)=2, 2.shl(1)=4, 2.shl(2)=8
    //where c=2
    //shift left
    println(c.shl(4))// it print 32

    //shr mean shit right it just oppiste of shift left it will give exact half value of given 2.shr(1)=1, 8.shr(2)=2, 5.shr(1)=2
    //where c=2
    //shift right
    print(c.shr(1))//print  1

    //xor it cancle the same value and incerment even value and decrement odd value 1.xor(1)=0, 2.xor(1)=3, 3.xor(1)=2
    //where c=2
    //XOR
    print(c.xor(1))//print  3

    //and it wont cancle the same value if same value are there than print same even both are negative than print negative other will give biger one
    //2.and(2)=2, 2.and(1)=0, -2.and(-2)=-2, -2.and(2)=2
    //where c=2
    //AND
    print(c.and(1))//print  0




}