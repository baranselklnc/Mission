package com.example.mission.ui

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mission.data.TaskDatabase

class TaskViewModelFactory(
    private val application: Application,
    private val database: TaskDatabase
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
            return TaskViewModel(application, database) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
