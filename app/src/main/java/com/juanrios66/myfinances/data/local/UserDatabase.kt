package com.juanrios66.myfinances.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.juanrios66.myfinances.data.local.dao.UserDAO
import com.juanrios66.myfinances.data.local.entities.User

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDAO
}