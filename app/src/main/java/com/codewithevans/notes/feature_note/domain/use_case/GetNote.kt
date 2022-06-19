package com.codewithevans.notes.feature_note.domain.use_case

import com.codewithevans.notes.feature_note.domain.model.Note
import com.codewithevans.notes.feature_note.domain.repository.NoteRepository

class GetNote(
    private val noteRepository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? = noteRepository.getNoteById(id)
}