package com.juanrios66.myfinances.ui.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tabla_usuarios")
data class User (
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name= "id") val id: Int,
    @ColumnInfo(name = "nombre") val nombre: String ? = null,
    @ColumnInfo(name = "email") val email: String ? = null,
    @ColumnInfo(name = "pass") val password: String? = null,
)