object q1{
  def main(args: Array[String]) : Unit = {
    val radius = 5
    val pi = 3.14
    val area = calcArea(radius, pi)
    println(s"The area of the disk with radius 5 is $area")

  }

  def calcArea(r: Double, pi: Double) : Double = {
    pi * r * r

}
}