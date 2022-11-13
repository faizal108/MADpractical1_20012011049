
fun main(){

    print("Enter number-1 : ")
    val num1 = readln()!!.toDouble()

    print("Enter a number-2 : ")
    val num2 = readLine()!!.toDouble()

    println("Addition of $num1 & $num2 is ${Sum(num1,num2)}")
    println("Subtraction of $num1 & $num2 is ${Minus(num1,num2)}")
    println("Product of $num1 & $num2 is ${Multi(num1,num2)}")
    println("Dividion of $num1 & $num2 is ${Divide(num1,num2)}")

}

fun Sum(a:Double,b:Double): Double {
    return a+b
}
fun Minus(a:Double,b:Double): Double {
    return a-b
}
fun Multi(a:Double,b:Double): Double {
    return a*b
}
fun Divide(a:Double,b:Double): Double {
    return a/b
}