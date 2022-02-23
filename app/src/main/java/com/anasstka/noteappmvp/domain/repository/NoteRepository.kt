package com.anasstka.noteappmvp.domain.repository

import com.anasstka.noteappmvp.domain.model.Note
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe

interface NoteRepository {

    fun getNotes(): Flowable<List<Note>>

    suspend fun getNoteById(id: Int): Maybe<Note>

    suspend fun insertNote(note: Note): Completable

    suspend fun deleteNote(note: Note): Completable
}