object q1andq2 extends App{
    //data structure for rational numbers
    class Rational(x:Int, y:Int) {
        def numer = x
        def denom = y

        //method which gives a negative number
        def neg = new Rational(-1 * this.numer, this.denom)

        //method to substract two rational numbers
        def sub(r:Rational) = new Rational(numer * r.denom - r.numer * denom, denom * r.denom)

        override def toString = numer + "/" + denom
    }

    val x = new Rational(3,4)
    val y = new Rational(5,8)
    val z = new Rational(2,7)

    // x -> -x
    println(x.neg)

    //x-y-z
    println(x.sub(y).sub(z))
}