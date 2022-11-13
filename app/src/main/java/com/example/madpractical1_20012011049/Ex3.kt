fun main()
{
    val obj = ArrayList<Student> (5)

    obj.add(Student())
    obj.add(Student("49","CE","D","AB16","Faizal","Kadiwal",19))
    obj.add(Student("107","CE","A","AB1","Manan","Patel", 22))
    obj.add(Student("103","CE","D","A14","Krish","Patel",22))
    obj.add(Student("159","AI","B","A10","Parth","Sharma",20))
    obj.add(Student("100","CE","B","AB9","yash","thakkar",19))

    for (i in obj)
    {
        i.details()
        i.studentinfo()
    }

}
open class Person(private val fn: String, private val ln: String, private val age: Int)
{
    fun details() {
        println("First Name = $fn")
        println("Last Name = $ln")
        println("Age = $age")
    }
}

class Student(private val enroll: String,private val branch: String,private val Class: String,private val batch: String,fname: String,lname: String,age: Int) : Person(fname, lname, age)
{

    constructor() : this("NaN", "NaN", "NaN", "NaN", "NaN", "NaN", 0)
    {
        println("Secondary Constructor")
    }
    fun studentinfo()
    {
        println("Enrollment Number : $enroll")
        println("Branch : $branch")
        println("Class : $Class")
        println("Batch : $batch")
    }
}