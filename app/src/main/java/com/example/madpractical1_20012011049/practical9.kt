fun main()
{
    var max =0
    var count = 0
    println("Enter the size of array:")
    val size = readLine()!!.toInt()
    var a= Array<Int>(size){0}
    for(i in 0..size-1)
    {
        print("a[$i]=")
        a[i] = readLine()!!.toInt()
    }

    for (i in a) {
        count = i
        if (i > max) {
            max = i
        }
        count++
    }
    println("largest number is:")
    println(max)

}