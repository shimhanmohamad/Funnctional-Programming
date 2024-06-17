
object q3{
  def main(args: Array[String]) : Unit = {
    val pi = 3.14159
    var radius = 5
    var volume = calcVolume(radius, pi)
    println(s"The Volume of a Sphere with Radius $radius is $volume")
  }

  def calcVolume(r : Double, pi : Double) : Double = {
    (4.0 / 3.0) * pi * r * r * r
}
}
