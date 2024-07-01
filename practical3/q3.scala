object mean{
    def Mean(a:Int,b:Int):Float = {
        var mean = (a.toFloat + b.toFloat)/2
        return mean
    }
}
object q3 extends App{
    print("Enter the number 1 : ")
    var num1 = scala.io.StdIn.readInt()
    print("Ente the number 2 : ")
    var num2 = scala.io.StdIn.readInt()
    var result = mean.Mean(num1,num2)
    println("Mean between two numbers : "+ result)
}