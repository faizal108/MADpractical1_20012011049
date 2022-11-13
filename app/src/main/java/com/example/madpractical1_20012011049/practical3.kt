
fun main() {

    print("Student enroll No. : ")
    var enroll:Int = readLine()!!.toInt()
    print("Student Name: ")
    var name:String? = readLine()
    print("Student Branch : ")
    var branch:String? = readLine()
    print("Student Class : ")
    var cls:String? = readLine()
    print("Student Batch : ")
    var batch:String? = readLine()
    print("Student College Name : ")
    var clgname:String? = readLine()
    print("Student University Name : ")
    var uniname:String? = readLine()
    print("Student  Age : ")
    var age:Int = readLine()!!.toInt()

    println("****************************")
    println("Student Details : ")

    println("Enroll no : $enroll")
    println("Name : $name")
    println("Age : $age")
    println("Branch : $branch")
    println("Class : $cls")
    println("Batch : $batch")
    println("College Name : $clgname")
    println("University Name : $uniname")
}