object q3 extends App{
    def sal(n:Int,o:Int):Double = {
        var nws = 250
        var ows = 85
        var tax = 0.12
        
        var per_week_salary = (n * nws + o*ows) * 0.88
        var per_month_salary = per_week_salary * 4
        return per_month_salary
    }
     var total = sal(40,30)
     println("Salary for Month  =  " + total)
}