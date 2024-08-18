object deposite{
    var interest : Int => Unit = (deposite => {
        if (deposite > 20000 && deposite < 200000){
            var interest_amount1 = (2.0 / 100) * deposite
            println(s"Interest amount : $interest_amount1")
        }
        else if(deposite > 200000 && deposite < 2000000){
            var interest_amount2 =  (4.0 / 100)* deposite
            println(s"Interest amount : $interest_amount2")
        }
        else{
            var interest_amount3 = (3.5 / 100) * deposite
            println(s"Interest amount : $interest_amount3")
        }
    })
}


object q1 extends App{
    deposite.interest(300000)
    deposite.interest(30000)
    deposite.interest(6000000)
}