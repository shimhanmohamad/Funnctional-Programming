object sum {
    def Sum(a: Int, arr: Array[Int]): Int = {
        var total = 0
        for (i <- 0 until a) {
            total = total + arr(i)
        }
        return total
    }
}

object q4 extends App {
    print("How many numbers you want to find Sum: ")
    var num = scala.io.StdIn.readInt()
    var array = new Array[Int](num)
    for (i <- 0 until num) {
        print(s"Enter the number ${i + 1}: ")
        var number = scala.io.StdIn.readInt()
        array(i) = number
    }
    println(array.mkString(", "))

    var result = sum.Sum(num, array)
    println(s"The sum of the numbers is: $result")
}
