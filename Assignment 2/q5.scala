object q5 extends App{
    val easy:Int = 8;
    val tempo:Int = 7;
    def easyPace(d1:Int, d3:Int):Int = (d1+d3) * easy;
    def tempoPace(d2:Int):Int = d2 * tempo;
    def totTime(d1:Int, d2:Int, d3:Int):Int = easyPace(d1,d3) + tempoPace(d2);
    printf("Total running time = %d", totTime(2,3,2));
}