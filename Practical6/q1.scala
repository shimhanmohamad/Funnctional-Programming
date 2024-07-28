case class Product(id: Int, name: String, price: Double, quantity: Int)

object Warehouse {
  def printProductNamesAndIds(map: Map[Int, Product]): Unit = {
    map.foreach { case (id, product) =>
      println(s"Product ID: $id, Name: ${product.name}")
    }
  }

  def totalValue(map: Map[Int, Product]): Unit = {
    var sum = 0.0
    map.foreach { case (_, product) =>
      sum += product.price * product.quantity
    }
    println(s"Total value of all products: ${sum}")
  }

  def mergeInventory(map1: Map[Int, Product], map2: Map[Int, Product]): Map[Int, Product] = {
    map1 ++ map2
  }

  def highestPrice(map: Map[Int, Product]): Unit = {
    val high = map.values.map(_.price).max
    println(s"Highest price: ${high}")
  }

  def checkProductInMap(map: Map[Int, Product], product: Product): Unit = {
    println(s"Product ID ${product.id} in map: ${map.contains(product.id)}")
  }
}

object Q1 extends App {
  val inventory1: Map[Int, Product] = Map(
    1 -> Product(1, "Laptop", 999.99, 10),
    2 -> Product(2, "Smartphone", 499.99, 15),
    3 -> Product(3, "Tablet", 299.99, 20)
  )

  val inventory2: Map[Int, Product] = Map(
    4 -> Product(4, "Monitor", 199.99, 30),
    5 -> Product(5, "Keyboard", 49.99, 50),
    6 -> Product(6, "Mouse", 29.99, 100)
  )

  Warehouse.printProductNamesAndIds(inventory1)
  println("***********************************************************")
  Warehouse.totalValue(inventory1)
  println("***********************************************************")
  println(inventory1.isEmpty)
  println("***********************************************************")
  val inventories = Warehouse.mergeInventory(inventory1, inventory2)
  println(inventories)
  println("***********************************************************")
  Warehouse.highestPrice(inventories)
  println("***********************************************************")
  val productToCheck = Product(1, "Laptop", 999.99, 10)
  Warehouse.checkProductInMap(inventory1, productToCheck)
}
