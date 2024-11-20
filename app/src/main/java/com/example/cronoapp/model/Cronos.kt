package com.example.cronoapp.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "cronos")
data class Cronos(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    @ColumnInfo(name = "titulo")
    val titulo: String,
    @ColumnInfo(name = "crono")
    val crono: Long
)

