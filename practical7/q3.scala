object primenumber {
  def filterPrimeNumber(list: List[Int]): List[Int] = {
    list.filter(number => {
      if (number <= 1) {
        false
      } 
      else if (number == 2) {
        true
      } 
      else if (number % 2 == 0) {
        false
      } 
      else {
        val sqrtNumber = Math.sqrt(number).toInt
        var isPrime = true
        for (i <- 3 to sqrtNumber) {
          if (number % i == 0) {
            isPrime = false
          }
        }
        isPrime
      }
    })
  }
}

object q1 extends App {
   print("how many element do you want to filter prime numbers : ")
    var num = scala.io.StdIn.readInt()
    var numbers:List[Int] = List()
    for(i <- 1 to num){
        print(s"Enter the number ${i}  : ")
        val element = scala.io.StdIn.readInt()
        numbers = numbers :+ element;
    }
    val primenumbers = primenumber.filterPrimeNumber(numbers)
    println(primenumbers)
}
