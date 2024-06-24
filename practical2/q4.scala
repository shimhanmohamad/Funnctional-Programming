object q4 extends App {
    def income(count: Int): Int = {
        count match {
            case 120 => (120 * 15) - 500 - (120 * 3)
            case 100 => (100 * 20) - 500 - (100 * 3)
            case 140 => (140 * 10) - 500 - (140 * 3)
        }
    }

  
    val cost = Array((120, income(120)), (140, income(140)), (100, income(100)))

    for ((ticketPrice, income) <- cost) {
        println(s"Income for ticket price Rs.$ticketPrice is: Rs.$income")
    }
    
    val (bestTicketPrice, highestIncome) = cost.maxBy(_._2)
    println(s"Highest income is: Rs.$highestIncome at ticket price Rs.$bestTicketPrice")
}
