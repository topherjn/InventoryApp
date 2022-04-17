package com.example.inventory.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.net.URI

@Entity
data class Site (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name="name")
    val siteName: String,
    @ColumnInfo(name="arrondissement")
    val arrondissement: Int,
    @ColumnInfo(name="uri")
    val uri: String
    )