package com.example.edutrack.ui.task

import com.example.edutrack.domain.model.Subject
import com.example.edutrack.util.Priority

data class TaskState(
    val title: String = "",
    val description: String = "",
    val dueDate: Long? = null,
    val isTaskComplete: Boolean = false,
    val priority: Priority = Priority.LOW,
    val relatedToSubject: String? = null,
    val subjects: List<Subject> = emptyList(),
    val subjectId: Int? = null,
    val currentTaskId: Int? = null
)