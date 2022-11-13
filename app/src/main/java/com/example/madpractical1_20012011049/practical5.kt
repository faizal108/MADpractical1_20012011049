
fun main(){

    print("Enter Month Number : ")
    var monthnum = readLine()!!.toInt()

    when(monthnum){
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else-> println("Plz!! Enter a proper Number :(")
    }
}