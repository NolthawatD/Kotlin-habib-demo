package com.example.habibidemo.data.model

import com.example.habibidemo.data.Priority

data class TaskUpdateRequest (
    val description: String?,
    val isReminderSet: Boolean?,
    val isTaskOpen: Boolean?,
    val priority: Priority?
)