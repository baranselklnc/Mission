package com.example.mission

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData

class TaskViewModel(
    application: Application,
    private val database: TaskDatabase
) : AndroidViewModel(application) {

    val allTasks: LiveData<List<Task>> = database.taskDao().getAllTasks()

    // Diğer ViewModel işlevleri burada
}
