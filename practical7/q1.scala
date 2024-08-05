object even {
    def filterEvenNumber(list : List[Int]) : Unit = {
        val  evennumber = list.filter(number => number % 2 == 0)
        println(evennumber)
    }
}


object q1 extends App {
   print("how many element do you want to filter : ")
    var num = scala.io.StdIn.readInt()
    var numbers:List[Int] = List()
    for(i <- 1 to num){
        print(s"Enter the number ${i}  : ")
        val element = scala.io.StdIn.readInt()
        numbers = numbers :+ element;
    }
    even.filterEvenNumber(numbers)
} 