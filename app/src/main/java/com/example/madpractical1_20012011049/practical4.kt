
fun main(){

    print("Enter a number : ")
    var a = readLine()!!.toInt()

    if (a%2 ==0)
        println("$a is Even :)")
    else
        println("$a is Odd :(")
}