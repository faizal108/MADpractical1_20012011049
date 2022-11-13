fun main(){

    var a:Int = 10
    var b:Double = a.toDouble()

    var c:String = "23"
    var d:Int = c.toInt()

    println("Inter val : $a")
    println("Double val (from Int) : $b")
    println("String Val : $c")
    println("Integer val (from String) : ${c.toInt()}")
    println("Integer val (from String) : $d")
    println("Double val (from String) : ${c.toDouble()}")
}