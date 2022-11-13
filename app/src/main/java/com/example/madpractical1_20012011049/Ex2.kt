fun main()
{
    val obj = ArrayList<Laptop> (5)

    obj.add(Laptop())
    obj.add(Laptop("i5",8,512,"HP Laptop",1,50000))
    obj.add(Laptop("i7",16,1000,"Lenovo Laptop",1,85000))
    obj.add(Laptop(" i9",16,1000,"HP Laptop",1,99000))
    obj.add(Laptop("i3",8,1000,"Dell Laptop",1,85000))
    obj.add(Laptop("Ryzen 5",8,1000,"Asus Laptop",1,60000))

    for (i in obj)
    {
        i.laptop()
        println("-------------")
    }

}
open class Product(private var Name: String, private var qty: Int, private var amt: Int)
{

    fun product()
    {
        println("\n Laptop Details : \n")
        println("Name : $Name")
        println("Qty : $qty")
        println("Amount : $amt")
    }
}

class Laptop(
    private var cpu: String, private var ram: Int, private var hdd: Int,
    name: String, qty: Int, amt: Int
) : Product(name, qty, amt)
{

    constructor() : this("None", 0, 0, "None", 0, 0)
    {
        println("Secondary Constructor")
    }

    fun laptop()
    {
        product()
        println("CPU Name : $cpu")
        println("RAM Size : $ram GB")
        println("HDD Size : $hdd GB")
    }
}