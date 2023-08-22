import java.util.Scanner
import kotlin.reflect.typeOf

fun main(args: Array<String>) {
    var numRange = (1..100).random();
    var read = Scanner(System.`in`)
    var life = 5;


    while (life >= 0) {
        println("entrer un chiffre")
        var num1 = read.nextInt()

        if ( num1 == numRange) {
            println("Bien joué c'est le bon chiffre !")

        } else {
            println("Ce n'est pas le bon chiffre il te reste :" + life + " vie")

        }
        if(life == 0)
        {
            println("Le bon chiffre était: " + numRange)
        }
        life = life - 1
    }

    //println("Premier input : " + num1)
}