object q4 extends App {
    def isEven(n:Int):Boolean = n match {
        case 0 => true
        case _ => isOdd(n-1)
    }

    def isOdd(n:Int): Boolean = !(isEven(n))

    printf("Enter number: ")
    var num:Int = scala.io.StdIn.readInt()
    if(isEven(num)){println("The number is even")}
    else{println("The number is odd")}
}