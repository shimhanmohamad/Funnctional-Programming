object shop {
    def displayInventory(grocery: Array[String], quantity: Array[Int]):Unit = {
        for (i <- grocery.indices) {
            println(grocery(i) + " = " + quantity(i))
        }
    }

    def restockItem(grocery:Array[String],item:String,quantity:Array[Int]):Unit = {
          var found = false
          for(i <- grocery.indices){
            if(grocery(i) == item){
                found = true
                print("Final quantity of "+ grocery(i) +" = " + (quantity(i) + 50))
            }
          }
          if(!found){
            println("There is no item in the stock")
          }
    }
    def selItem(grocery:Array[String],item:String,quantity:Array[Int]):Unit = {
          var found = false
          for(i <- grocery.indices){
            if(grocery(i) == item && quantity(i) > 100){
                found = true
                print("Final quantity of "+ grocery(i) +" = " + (quantity(i) - 50))
            }
          }
          if(!found){
            println("There is no item in the stock or out of stock")
          }
    }
}

object q1 extends App {
    var grocery = Array("flour", "milk", "coconut", "rice", "dhal", "sugar")
    var qua = Array(90, 150, 120, 350, 250, 300)
    print("Enter the item you want to check : ")
    var item = scala.io.StdIn.readLine()
    shop.displayInventorygroce(grocery, qua)
    shop.restockItem(grocery,item,qua)
    shop.selItem(grocery,item,qua)
}
