package com.elifnuroksuz.notes.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0, // Integer type and default value provided
    val noteTitle: String,
    val noteDesc: String
) : Parcelable
