package com.anasstka.noteappmvp.data.data_source

import androidx.room.*
import com.anasstka.noteappmvp.domain.model.Note
import io.reactivex.Completable
import io.reactivex.Flowable
import io.reactivex.Maybe

@Dao
interface NoteDao {

    @Query("SELECT * FROM note")
    fun getNotes(): Flowable<List<Note>>

    @Query("SELECT * FROM note WHERE id = :id")
    fun getNoteById(id: Int): Maybe<Note>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertNote(note: Note): Completable

    @Delete
    fun deleteNote(note: Note): Completable
}