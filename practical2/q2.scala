object q2 extends App{
    var a =2
    var b=3
    var c=4
    var d=5
    var k = 4.3f

    b -=1
    d-=1
    var result1 = b * a + c*d
    println("- -b * a + c *d - -  = " + result1)
    a +=1
    println("a++ = "+a)
    var g = 12
    var result2 = -2 * (g-k) + c
    println("-2 * ( g - k ) +c = "+ result2)
    c +=1
    println("c=c++ = " + c)
    var result3 = c * a
    println("c=++c*a++ = " + result3)
}