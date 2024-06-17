object q2{
  def main(args: Array[String]) : Unit = {
    val celcius = 35
    val fahr = convertor(celcius)
    println(s"The Temperature $celcius C in Fahrenheit is $fahr F")
    
  }

  def convertor(celc : Double) : Double = {
    celc * 1.8 + 32.0
  }
}