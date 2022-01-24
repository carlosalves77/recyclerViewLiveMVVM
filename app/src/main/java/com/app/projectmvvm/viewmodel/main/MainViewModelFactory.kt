package com.app.projectmvvm.viewmodel.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.projectmvvm.repository.MainRepository
import java.lang.IllegalArgumentException


class MainViewModelFactory constructor(private val repository: MainRepository) : ViewModelProvider.Factory {

    override  fun <T: ViewModel> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            MainViewModel(this.repository) as T
        } else {
            throw  IllegalArgumentException("Viewmodel Not Found")
        }
    }

}