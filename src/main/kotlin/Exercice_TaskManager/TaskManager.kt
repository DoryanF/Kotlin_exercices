package Exercice_TaskManager
import Exercice_TaskManager.Tasks
open class TaskManager constructor(){
    var listTask: MutableList<Tasks> = mutableListOf()

    fun addTask(title: String){
        if(title.length > 0){
            listTask.add(Tasks(listTask.count(), title))
        }
    }

    fun completedTask(id: Int){
        if (id in listTask.indices)
        {
            listTask[id].isCompleted = true
        }
    }

    fun MutableList<Tasks>.printListTasks(){
        for (task in this)
        {
            println(task)
        }
    }

    fun printsTask()
    {
        listTask.printListTasks()
    }
}