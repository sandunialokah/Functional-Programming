object q6 extends App {
    def fib(n:Int):Int = n match {
        case 0 => 0
        case x if x==1 => 1
        case _ => fib(n-1)+fib(n-2)
    }

    def fibSeq(n:Int):Any = {
        if(n>0) fibSeq(n-1)
        printf("%d ", fib(n))
    }
 
    printf("Enter number: ")
    var num:Int = scala.io.StdIn.readInt()
    fibSeq(num)

   
}