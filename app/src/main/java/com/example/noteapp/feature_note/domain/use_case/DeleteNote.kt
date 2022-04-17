package com.example.noteapp.feature_note.domain.use_case

import com.example.noteapp.feature_note.domain.model.NoteEntity
import com.example.noteapp.feature_note.domain.repository.NoteRepository

class DeleteNote(
    private val repository: NoteRepository
) {

    suspend operator fun invoke(note: NoteEntity) {
        repository.deleteNote(note)
    }
}