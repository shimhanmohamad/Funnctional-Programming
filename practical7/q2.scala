object square {
    def calculateSquare(list : List[Int]) : Unit = {
        val  squarenumbers = list.map(number=>number * number)
        println(squarenumbers)
    }
}


object q1 extends App {
   print("how many element do you want to find square number : ")
    var num = scala.io.StdIn.readInt()
    var numbers:List[Int] = List()
    for(i <- 1 to num){
        print(s"Enter the number ${i}  : ")
        val element = scala.io.StdIn.readInt()
        numbers = numbers :+ element;
    }
    square.calculateSquare(numbers)
} 