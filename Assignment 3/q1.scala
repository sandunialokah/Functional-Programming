object q1 extends App{
    def interest(deposit:Double):Double = deposit match{
        case x if x < 20000 => x * .02
        case x if x < 200000 => x *.04
        case x if x < 2000000 => x *.035
        case x if x >= 2000000 => x * .065
    }

    printf("Enter the deposit amount: ")
    var deposit = scala.io.StdIn.readInt()
    print(interest(deposit))
}