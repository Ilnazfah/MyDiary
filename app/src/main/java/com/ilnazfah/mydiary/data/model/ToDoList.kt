package com.ilnazfah.mydiary.data.model

import java.sql.Timestamp

data class ToDoList(
    val id: Int,
    val dateStart: Timestamp,
    val dateFinish: Timestamp,
    val name: String,
    val description: String
)