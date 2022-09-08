object q2 extends App{
    def convertTemp(celcius:Int) = celcius * 1.8000 + 32.00;
    printf("35 degree celcius converted to farenheit = %f", convertTemp(35));
}