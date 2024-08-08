package com.example.edutrack.ui.session

import com.example.edutrack.domain.model.Session
import com.example.edutrack.domain.model.Subject

data class SessionState(
    val subjects: List<Subject> = emptyList(),
    val sessions: List<Session> = emptyList(),
    val relatedToSubject: String? = null,
    val subjectId: Int? = null,
    val session: Session? = null
)