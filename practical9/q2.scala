object patternmatching{
    var check : Int => Unit = (number => {
        if(number < 0 ||  number == 0){
            println("Number is below 0 or negative number")
        }
        else if(number % 2 == 0){
            println("Number is Even number")
        }
        else{
            println("Number is odd number")
        }
    })
}

object q2 extends App{
    patternmatching.check(4)
    patternmatching.check(5)
    patternmatching.check(-3)
    patternmatching.check(0)
}