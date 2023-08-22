package Exercice_TaskManager

import java.util.*

class Tasks constructor(val id: Int, val title: String, var isCompleted: Boolean = false) {

    override fun toString(): String {
        return "Tasks(id=$id, title='$title', isCompleted=$isCompleted)"
    }
}