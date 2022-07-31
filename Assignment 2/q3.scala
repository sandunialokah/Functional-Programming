object q3 extends App{
    def volumeSphere(r:Int) = (4 * math.Pi * r * r * r) / 3;
    printf("Volume of a sphere of radius 5 = %f", volumeSphere(5));
}