object q3andq4 extends App{
    //data structure for account
    class Account(id:String, accno:Int, balance:Int) {
        val nic:String = id
        val accountno:Int = accno
        var bal:Int = balance 

        //method which transfer money from one acccount to another
        def transfer(a:Account, amount:Int) = {
            val transferacc = q3andq4.find(a.accountno,Bank)
            if(bal<0){
                println("Insufficient balance")
            }
            else{
                this.bal = this.bal- amount
                a.bal = a.bal + amount
                println("Succcessfully transfered")
            }
           
        }

        override def toString = "["+nic+","+accountno +","+ bal+"]"
    }

    //function to calculae the interest for each account
     def interest(a:Account) = a match{
        case x if x.bal > 0 => x.bal * 0.05
        case x if x.bal < 0 => x.bal * 0.1
    }

    //find an account
    val find = (n:Int, b:List[Account]) => b.filter(account => account.accountno.equals(n))

    //list of accounts with negative balances
    val negbalance = (b:List[Account]) => b.filter(_.bal < 0)

    //sum of all account balances
    val sum = (b:List[Account]) => b.foldLeft(0.0)((x,y) => x+y.bal)

    //final balance of all accounts after applying interest function
    val finalbalanace = (b:List[Account]) => b.map(x => interest(x)+x.bal)

    //acounts created
    val acc1 = new Account("20060801695", 001, 1000)
    val acc2 = new Account("20060802536", 002, 20000)
    val acc3 = new Account("20060805036", 003, -500)

    //bank is a collection of accounts
    var Bank:List[Account] = List(acc1, acc2, acc3)
    println(Bank)

    //list of bank accounts with negative balances
    println(negbalance(Bank))

    //sum of all bank balances
    println(sum(Bank))

    //final balance of all accounts after applying interest function
    println(finalbalanace(Bank))

    //transfer money
    acc2.transfer(acc1, 100)

    println(Bank)
}