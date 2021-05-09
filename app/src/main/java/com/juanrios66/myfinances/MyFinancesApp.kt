package com.juanrios66.myfinances

import android.app.Application
import androidx.room.Room
import com.juanrios66.myfinances.data.local.UserDatabase

class MyFinancesApp:Application() {

    companion object{
        lateinit var database: UserDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database= Room.databaseBuilder(
            this,
            UserDatabase::class.java,
            "user.db"
        ).allowMainThreadQueries()
            .build()
    }
}