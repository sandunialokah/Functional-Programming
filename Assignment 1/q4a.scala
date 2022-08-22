object q4a extends App{
    val normalWorkingHourRate:Int = 250;
    val otHourRate:Int = 85;
    val taxRate: Double = .12;
    def normalSalary(normal:Int): Int = normal * normalWorkingHourRate
    def otSalary(ot:Int): Int = ot * otHourRate
    def salary(normal:Int, ot:Int): Int = normalSalary(normal:Int) + otSalary(ot:Int);
    def tax(salary:Int):Double =  salary * taxRate;
    def netSalary(normal:Int, ot:Int):Double =  salary(normal:Int, ot:Int) -  tax(salary(normal:Int, ot:Int));
    println(netSalary(40,30));
}