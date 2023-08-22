package Exercice_TaskManager

fun main(args: Array<String>) {

    var taskManag = TaskManager()

    taskManag.addTask("Faire les courses")
    taskManag.addTask("Apprendre Kotlin")

    taskManag.completedTask(1)

    taskManag.printsTask()
}

