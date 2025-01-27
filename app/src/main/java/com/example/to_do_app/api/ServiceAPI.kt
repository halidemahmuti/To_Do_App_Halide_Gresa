package com.example.to_do_app.api

import com.example.to_do_app.model.RequestModel
import com.example.to_do_app.model.ToDoJSON
import com.example.to_do_app.model.Users

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceAPI {
    @GET("todos")
    fun getAllToDos() : Call<ToDoJSON>


    @POST("users")
    fun createUser(@Body user: RequestModel): Call<RequestModel>

}