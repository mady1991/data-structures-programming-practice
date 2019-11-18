package run.java.com.javarunprogram.kotlin

fun main() {
    //inline funcation are used to boost up the Higher function in this we have to pass lambda
    // and lamda can retun itself value as well so if we pass two lambda into function and retun itself in fisrt lambda
    // funcation than another function wont call becoz of retun  to overcome with this we can used crossline keyword
    // which gives complier exception if these is retun value
    //this method define same
    inlineFunction({
        println("calling inline functions")
        return
    }, { println("next parameter in inline functions") })

    //noninline function by using this noninline function we can mark that lambda function to be non inline

    nonInlineFuncation({ println("non inline first call") }, { println("non inlne secend methdi cakk") })
}

inline fun inlineFunction(myFun: () -> Unit, crossinline nxtFun: () -> Unit) {
    nxtFun()
    myFun()

    println("code inside inline function")
}

inline fun nonInlineFuncation(myFun: () -> Unit, noinline myJava: () -> Unit) {
    myJava()
    myFun()

    print("Rest no inline")

}


