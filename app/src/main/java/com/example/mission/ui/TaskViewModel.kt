package com.example.mission.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import com.example.mission.data.Task
import com.example.mission.data.TaskDatabase

class TaskViewModel(
    application: Application,
    private val database: TaskDatabase
) : AndroidViewModel(application) {

    val allTasks: LiveData<List<Task>> = database.taskDao().getAllTasks()

    // Diğer ViewModel işlevleri burada
}
