package com.example.noteapp.feature_note.domain.repository

import com.example.noteapp.feature_note.domain.model.NoteEntity
import kotlinx.coroutines.flow.Flow

interface NoteRepository {

    suspend fun insertNote(note:NoteEntity)
    suspend fun getNoteById(id: Int) :NoteEntity?
    fun getNotes(): Flow<List<NoteEntity>>
    suspend fun deleteNote(note: NoteEntity)
}