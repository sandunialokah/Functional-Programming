object q4 extends App{
    printf("Enter a number: ")
    var num = scala.io.StdIn.readInt()

    def printNum(num:Int) = num match {
        case x if x<0 => "Negative is input"
        case x if x==0 => "Zero is input"
        case x if (x%2==0) => "Even number is given"
        case _ => "Odd number is given"
    }

    print(printNum(num));
}