object product {
    def getProductList(): List[String] = {
        var items = List[String]()
        var str: String = ""
        while (str != "done") {
            print("Enter the Item: ")
            str = scala.io.StdIn.readLine()
            if (str != "done") {
                items = items :+ str
            }
        }
        println("Product List: " + items)
        items
    }

    def printProductList(products: List[String]): Unit = {
        for (i <- products.indices) {
            println((i+1) +". " + products(i))
        }
    }
    def getTotalProducts(products:List[String]) : Int = {
        var count = 0
        for(i <- products.indices){
            count = count + 1
        }
        return count
    }
}

object q1 extends App {
    val product_list = product.getProductList()
    product.printProductList(product_list)
    var count_of_element = product.getTotalProducts(product_list)
    println("Total number of products : " + count_of_element )
}
