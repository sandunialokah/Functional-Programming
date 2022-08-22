object q5 extends App{
    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int): Boolean = !(isEven(n))

    def sum(n:Int):Int = n match{
        case 0 => 0
        case x if (isEven(x)) => n+sum(n-1)
        case _ => sum(n-1)
    }

    printf("Enter number: ")
    var num:Int = scala.io.StdIn.readInt()
    println(sum(num))
}