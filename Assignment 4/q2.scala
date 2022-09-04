object q2 extends App {
    def GCD(a:Int, b:Int):Int = b match {
        case 0 => a
        case x if x>a => GCD(x,a)
        case _ => GCD(b,a%b)
    }
    def prime(p:Int, n:Int=2):Boolean = n match {
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }

    def primeSeq(p:Int,i:Int):Any = {
        if(prime(p)){printf("%d ",p)}
        if(p<i){primeSeq(p+1,i)}
    }

    printf("Enter number to find the sequence upto: ")
    var num:Int = scala.io.StdIn.readInt()
    primeSeq(2,num)
}