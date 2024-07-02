object Reverse {
  def rev(str: String): Unit = {
    val stlength: Int = str.length
    for (i <- (stlength - 1) to 0 by -1) {
      print(str(i))
    }
  }
      def reverse(str:String):Unit={
        var l:Int = str.length;
        if(l>0){
            print(str.charAt(l-1));
            reverse(str.substring(0,l-1));
        }
    }

}

object q1 extends App {
  print("Enter the word you want to reverse : ")
  var word = scala.io.StdIn.readLine()
  
  print("Reverse string : ")
  // Reverse.rev(word)
  Reverse.reverse(word)
}
