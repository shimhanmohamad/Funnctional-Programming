
object q4{
  def main(args : Array[String]): Unit = {
    val coverPrice = 24.95
    var storeDiscount = 0.4
    val shipping50 = 3
    val additional = 0.75
    val numCopies = 60

    val Total  = calcTotal(coverPrice, storeDiscount, shipping50, additional, numCopies)

    println(s"The total wholesale cost for $numCopies is $Total Rupees")

  }

  def calcTotal(cover: Double, disc: Double, ship50: Double, add: Double, numCopies: Int) : Double = {
    val priceWithdisc = cover * (1 - disc)
    val TotalCost = priceWithdisc * numCopies

    val shipCost = if(numCopies <= 50){
      ship50
    }
    else{
      ship50 + (numCopies - 50) * add
    }

    TotalCost + shipCost
  }
}
