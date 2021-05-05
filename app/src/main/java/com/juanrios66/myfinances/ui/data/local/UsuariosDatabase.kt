package com.juanrios66.myfinances.ui.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.juanrios66.myfinances.ui.data.local.dao.UserDAO
import com.juanrios66.myfinances.ui.data.local.entities.User

@Database(entities = [User::class], version = 1)
abstract class UsuariosDatabase: RoomDatabase() {
    abstract fun UserDAO(): UserDAO
}