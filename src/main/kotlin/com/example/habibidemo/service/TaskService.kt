package com.example.habibidemo.service

import com.example.habibidemo.data.Task
import com.example.habibidemo.data.model.TaskCreateRequest
import com.example.habibidemo.data.model.TaskDto
import com.example.habibidemo.exception.TaskNotFoundException
import com.example.habibidemo.repository.TaskRepository
import org.springframework.stereotype.Service


@Service
class TaskService(private val repository: TaskRepository) {

    private fun mappingEntityToDto(task: Task) = TaskDto(
        task.id,
        task.description,
        task.isReminderSet,
        task.isTaskOpen,
        task.createdOn,
        task.priority
    )

    private fun mappingFromRequestToEntity(task: Task, request: TaskCreateRequest) {
        task.description = request.description
        task.isReminderSet = request.isReminderSet
        task.isTaskOpen = request.isTaskOpen
        task.priority = request.priority
    }

    private fun checkTaskForId(id: Long) {
        if (!repository.existsById(id)) {
            throw TaskNotFoundException("Task with the ID: $id does not exist!")
        }
    }


}