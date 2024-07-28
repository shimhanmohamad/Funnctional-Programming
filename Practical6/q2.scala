object student {
    def getStudentInfo() : (String, Int, Int, Double, String) = {
        // a. Function getStudentInfo
        def validname():String = {
            print("Enter student name  : ")
            var name = scala.io.StdIn.readLine()
            if(name.nonEmpty){
               name
            }
            else{
                println("Name cannot be empty")
                validname()
            }
        }
        def totalmarks() : Int = {
            print("Enter total possible marks : ")
            var Totalmarks = scala.io.StdIn.readInt()
            if(Totalmarks > 0){
                Totalmarks
            }
            else{
                println("Enter the valid total marks")
                totalmarks()
            }
        }
         
        def validmarks(totalmarks : Int):Int = {
            println("Enter marks : ")
            var mark = scala.io.StdIn.readInt()
            if(mark < totalmarks && mark > 0 ){
                mark
            }
            else{
                println("Marks cannot exceed the total marks")
                validmarks(totalmarks)
            }
        }
        
        var name = validname()
        var total = totalmarks() 
        var mark = validmarks(total)
        
        var percentage = ((mark.toDouble / total.toDouble) * 100)

        val grade =  if(percentage >= 90){
            "A"
        }
        else if(percentage >= 75 && percentage < 90){
            "B"
        }
        else if(percentage >= 50 && percentage < 75){
            "C"
        }
        else{
            "D"
        }        
        (name, mark, total, percentage, grade)
    }
    
    // b. Function printStudentRecord:
        def printStudentRecord(studentinfo:(String, Int, Int, Double, String)) : Unit ={
            val (name, mark, total, percentage, grade) = studentinfo
            println(studentinfo)
        }
}


object q2 extends App{
    val studentInfo = student.getStudentInfo()
    student.printStudentRecord(studentInfo)
}