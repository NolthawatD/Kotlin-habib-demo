package data.model

import jakarta.annotation.Priority

data class TaskUpdateRequest (
    val description: String?,
    val isReminderSet: Boolean?,
    val isTaskOpen: Boolean?,
    val priority: Priority?
)