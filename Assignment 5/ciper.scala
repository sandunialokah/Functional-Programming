object CeasarCipher extends App{
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    //encrypt function
    def encryptCeaser(alphabet:String, shift:Int) = {
        val secretMessage = scala.io.StdIn.readLine("Secret Message: ")
        
        val outputText = secretMessage.map( (c: Char) => { 
            val x = alphabet.indexOf(c.toUpper)

            // if something that is not in the alphabet is in the secret message it is kept without changing
            if (x == -1){
                c
            }
            // shifting to encrypt the secret message
            else{
                alphabet((x + shift) % alphabet.size)
                } 
        });

        println(outputText);
    }

    //decrypt function
    def decryptCeaser(alphabet:String, shift:Int) = {
        val secretMessage = scala.io.StdIn.readLine("Secret Message: ")

        val outputText = secretMessage.map( (c: Char) => { 
            val x = alphabet.indexOf(c.toUpper)

            if (x == -1){
                c
            }
            else{
                val num = (x + shift) % alphabet.size
                // if the shift calculated is negative adding 26 to get the index
                if(num<0){
                    alphabet(num+alphabet.size)
                }
                // if not negative shifting to decrypt the secret message
                else{
                    alphabet(num)
                }
                
            } 
        });

        println(outputText);
    }

    //function to select if the user want to encrypt or decrypt a message
     def ciper(key: String, shift:Int, alphabet:String) = key match {
        case "e" => encryptCeaser(alphabet, shift)
        case "d" => decryptCeaser(alphabet, shift * -1)
        case _ => println("Enter either e or d")
    }

    println("Encrypt: e Decrypt: d");
    val key = scala.io.StdIn.readLine("Do you want to encrypt or decrypt the message: ");

    // getting the shift for caesarciper as the user wants
    val shift = (scala.io.StdIn.readLine("Shift By: ").toInt + alphabet.size) % alphabet.size;

    ciper(key, shift, alphabet);
	
}