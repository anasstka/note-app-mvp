package com.anasstka.noteappmvp.data.repository

import com.anasstka.noteappmvp.data.data_source.NoteDao
import com.anasstka.noteappmvp.domain.model.Note
import com.anasstka.noteappmvp.domain.repository.NoteRepository
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe

class NoteRepositoryImpl(
    private val dao: NoteDao
) : NoteRepository {

    override fun getNotes(): Flowable<List<Note>> {
        return dao.getNotes()
    }

    override suspend fun getNoteById(id: Int): Maybe<Note> {
        return dao.getNoteById(id)
    }

    override suspend fun insertNote(note: Note): Completable {
        return dao.insertNote(note)
    }

    override suspend fun deleteNote(note: Note): Completable {
        return dao.deleteNote(note)
    }
}