object q3 extends App {
    def sum(n:Int):Int = n match{
        case 0 => 0
        case _ => n + sum(n-1)
    }

    printf("Enter number to find the sum: ")
    var num:Int = scala.io.StdIn.readInt()
    println(sum(num))
}