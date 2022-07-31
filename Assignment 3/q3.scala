object q5 extends App{
    def toUpper(str:String):String = str.toUpperCase()
    def toLower(str:String):String = str.toLowerCase()
    def formatNames(name:String)(funct:String=>String) = {
        funct(name)
    }

    println(formatNames("Benny")(toUpper(_)))
    println(formatNames("Niroshan")(toUpper(_)))
    println(formatNames("Saman")(toLower(_)))
    println(formatNames("Kumara")(toLower(_)))
}