import java.util.*
import java.util.Arrays
fun main (args: Array<String>) {

    val array1 = arrayOf(10, 90, 80, 60, 100)
    println("Create Array-1 by using arrayof() method:")
    println(Arrays.toString(array1))

    val array2 = arrayOf<Int>(0, 0, 0, 0, 0)
    println("Create Array-2 by using array<>() method:")
    println(Arrays.toString(array2))

    val array3 = arrayOf<Int>(0, 1, 2, 3, 4, 5, 6, 7)
    println("Create Array-3 by using array<>() and lambda function method:")
    println(array3.filter { item -> item > 0 })

    val array4 = IntArray(5)
    array4[0] = 0;
    array4[1] = 0;
    array4[2] = 0;
    array4[3] = 0;
    array4[4] = 0;
    println("Create Array-4 by using IntArray():")
    println(array4.joinToString())

    val array5 = intArrayOf(12, 10, 1, 5, 18, 19)
    println("Create Array-5 by using intArrayOf():")
    println(array5.joinToString())

    val array6 = arrayOf(intArrayOf(1, 3), intArrayOf(4, 5,), intArrayOf(6, 7))
    println("Create 2D Array-6 by using arrayOf and intArrayOf():")
    println(array6.contentDeepToString())


    val size = readLine()!!.toInt()
    var array7 = Array<Int>(size) {0}
    for(i in 0..size-1)
    {
        print("a[$i]=")
        array7[i] = readLine()!!.toInt()
    }

    println("Entered values:")
    print(array7.contentDeepToString())
    println("\n************With Built-in Function*************")
    println("After sorting by built-in function")
    array7.sort()
    print(array7.contentDeepToString())
    println("\n************without built-in function**********")
    println("\n\nAfter Sorting without buit-in function:")
    var temp = 0
    for (i in 0..array7.size-1) {
        for (j in i+1..array7.size-1)
        {
            if (array7[i] > array7[j])
            {
                temp = array7[i];
                array7[i] = array7[j];
                array7[j] = temp;
            }
        }
    }
    print(array7.contentDeepToString())

}






