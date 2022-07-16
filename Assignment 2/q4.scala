object q4 extends App{
    val coverPrice:Double = 24.95;
    val discountAmount:Double = .4;
    def cost(books:Int):Double = books * coverPrice;
    def discount(books: Int):Double = cost(books) * discountAmount;
    def shippingCost(books:Int):Double = if(books <=50) books*3 else 50*3+(books-50)*.75;
    def totalCost(books:Int):Double = cost(books) - discount(books) + shippingCost(books);
    printf("Wholesale cost for 60 copies = %f", totalCost(60));
}