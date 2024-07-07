object letter{
    def toUpper(str:String):String = {
        var result = str.toUpperCase()
        return result
    }
    def toLower(str:String):String = {
        var result = str.toLowerCase()
        return result
    }
   def firsttwo(str:String):String = {
       var two = str.substring(0,2).toUpperCase()
       var rest = str.substring(2)
       return two + rest
   }
   def firstLast(str:String):String = {
       var firstchar = str.head.toUpper
       var middle = str.substring(1,str.length-1)
       var lastchar =  str.last.toUpper
       return firstchar + middle + lastchar
   }

}


object q3 extends App{
    println(letter.toUpper("benny"))
    println(letter.firsttwo("niroshan"))
    println(letter.toLower("Saman"))
    println(letter.firstLast("kumar"))
}