object Reverse {
  def rev(str: String): Unit = {
    val stlength: Int = str.length
    for (i <- (stlength - 1) to 0 by -1) {
      print(str(i))
    }
  }
}

object q1 extends App {
  print("Enter the word you want to reverse : ")
  var word = scala.io.StdIn.readLine()
  
  print("Reverse string : ")
  Reverse.rev(word)
}
