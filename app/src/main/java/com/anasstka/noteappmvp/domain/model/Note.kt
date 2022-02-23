package com.anasstka.noteappmvp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.anasstka.noteappmvp.R
import java.lang.Exception

@Entity
data class Note(
    @PrimaryKey val id: Int?,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(
            R.color.mauve,
            R.color.red_pink,
            R.color.light_green,
            R.color.light_yellow,
            R.color.blue,
            R.color.light_violet
        )
    }
}

class InvalidNoteException(message: String): Exception(message)
