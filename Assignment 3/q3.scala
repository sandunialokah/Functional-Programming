object q5 extends App{
    def toUpper(str:String):String = str.toUpperCase()
    def toLower(str:String):String = str.toLowerCase()
    def formatNames(name:String)(indexs: Int*)(funct:String=>String):String = {
        if(indexs.isEmpty){
            return funct(name)
        }
        var temp = ""
        var i = 0
        while(i < name.length()){
            if(indexs.contains(i)){
                temp = temp + funct(name.charAt(i).toString)
            }
            else{
                temp = temp + name.charAt(i).toString
            }
            i = i + 1
        }
        temp
    }

    println(formatNames("Benny")()(toUpper(_)))
    println(formatNames("Niroshan")(0,1)(toUpper(_)))
    println(formatNames("Saman")()(toLower(_)))
    println(formatNames("Kumara")(5)(toUpper(_)))
}