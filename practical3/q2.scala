object filter {
  def five_char(str: String): Unit = {
    if (str.length > 5) {
      println(str)
    }
  }
}

object q2 extends App {
  print("How many words do you want to enter: ")
  val count = scala.io.StdIn.readInt()
  for (i <- 1 to count) {
    print(s"Enter the string $i: ")
    val word = scala.io.StdIn.readLine()
    filter.five_char(word)
  }
}
