object check{
    def checking(num:Int):Unit = {
        num match{
           case num if num <= 0 => println(" Negative/Zero")
           case num if num % 2 == 0 => println("Even Number")
           case _  => println("Odd Number")
        }
        
    }
}

object q2 extends App{
    print("Enter the number you want to check : ")
    var num = scala.io.StdIn.readInt()
    check.checking(num)
}