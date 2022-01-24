package com.app.projectmvvm.repository

import com.app.projectmvvm.rest.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService){

    fun getAllLives() = retrofitService.getAllLives()
}