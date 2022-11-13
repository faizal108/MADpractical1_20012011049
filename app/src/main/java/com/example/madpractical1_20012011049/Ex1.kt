fun main() {
    var a = 100
    var b = 10

    println("with using third variable:")
    print("the value of a is :$a and value of b is :$b")
    var c= a
    a=b
    b=c
    println("\nafter swapping")
    print("the value of a is :$a and value of b is :$b")

println("\n*************************")
    var d = 100
    var e = 10

    println("Without Using Third Variable:")
    println("Before Swapping")
    print("the value of a is :$d and value of b is :$e")
    d = (d + e)
    e = (d - e)
    d = (d - e)

    println("\nAfter Swapping")
    print("the value of a is :$d and value of b is :$e")
}
