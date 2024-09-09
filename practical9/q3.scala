<<<<<<< HEAD
object Letters{
    var upper :String => Unit = (word => {
        var string = word.toUpperCase
        println(string)
    })

    var lower :String => Unit = (word => {
        var string = word.toLowerCase
        println(string)
    })

    val formatNames: String => Unit = word => {
        val firstLetter = word.head.toUpper
        val secondLetter = word.charAt(1).toUpper
        var leftPart = ""
        for (i <- 2 until word.length) {
            leftPart += word(i).toLower
        }
        println(s"$firstLetter$secondLetter$leftPart")
    }
    var formatNames2 : String => Unit = (word => {
        var firstletter = word.head.toUpper
        var lastletter = word.charAt(word.length-1).toUpper
        var middleletters = ""
        for(i <- 1 until word.length - 1 ){
            middleletters += word(i).toLower
        }
        println(s"$firstletter$middleletters$lastletter")
    })
}

object q3 extends App{
    Letters.upper("benny")
    Letters.formatNames("niroshan")
    Letters.formatNames2("kumara")
    Letters.lower("SaMan")
=======
object Letters{
    var upper :String => Unit = (word => {
        var string = word.toUpperCase
        println(string)
    })

    var lower :String => Unit = (word => {
        var string = word.toLowerCase
        println(string)
    })

    val formatNames: String => Unit = word => {
        val firstLetter = word.head.toUpper
        val secondLetter = word.charAt(1).toUpper
        var leftPart = ""
        for (i <- 2 until word.length) {
            leftPart += word(i).toLower
        }
        println(s"$firstLetter$secondLetter$leftPart")
    }
    var formatNames2 : String => Unit = (word => {
        var firstletter = word.head.toUpper
        var lastletter = word.charAt(word.length-1).toUpper
        var middleletters = ""
        for(i <- 1 until word.length - 1 ){
            middleletters += word(i).toLower
        }
        println(s"$firstletter$middleletters$lastletter")
    })
}

object q3 extends App{
    Letters.upper("benny")
    Letters.formatNames("niroshan")
    Letters.formatNames2("kumara")
    Letters.lower("SaMan")
>>>>>>> b8d118925cb45161fce506bea510243ad52b376f
}