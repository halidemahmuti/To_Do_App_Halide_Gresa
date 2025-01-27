package com.example.to_do_app.model

data class ToDo(
    val userId: Int,
    val id: Int,
    val todo: String?,
    val completed: Boolean
)