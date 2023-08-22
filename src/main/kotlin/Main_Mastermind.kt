import java.awt.List
import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {
    var read = Scanner(System.`in`)
    println("Bienvenue dans le jeu MASTERMIND")

    var listColor = listOf("jaune","vert","bleu","rouge","orange","blanc","noir")

    /*var test3 = test.zip(test2)
    var test4 = test3.intersect()
    println(test4)*/
    print("Veuillez choisir le nombre de tentatives: ")
    var maxAttempts = read.nextInt()
    print("Veuillez choisir le nombre de couleurs de la séquence secrète (entre 4 et 7): ")
    var nbrColorInput = read.nextInt()
    var tableau = listColor.shuffled().take(nbrColorInput).toMutableList()

    println(tableau)
    /*print("Veuillez écrire une Couleur: ")
    read.next()*/



    //println(tableauRéponseSecrete)
    /*for (attempts in 1..maxAttempts)
    {
        print("Tentative $attempts: ")
    }*/

    //println(test)
}