object q3 extends App{
    var (a, b, c, d) = (2, 3, 4, 5);
    var k:Float = 4.3f;

    //println(--b * a + c *d --);  //postfix and prefix operators are not supported by scala
    b = b - 1;
    println(b * a + c * d);
    d = d - 1;

    //println(a++);
    println(a);
    a = a + 1; 

    //println(-2 * ( g - k ) +c);  // g is not defined

    //println(c=c++);
    println(c);
    c = c + 1;

    //println(c=++c*a++);
    c = c + 1;
    println(c*a);
    a = a + 1;
}