package com.juanrios66.myfinances

import android.app.Application
import androidx.room.Room
import com.juanrios66.myfinances.ui.data.local.UsuariosDatabase

class MyFinancesApp: Application() {

    companion object{
        lateinit var database: UsuariosDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            this,
            UsuariosDatabase::class.java,
            "usuarios.db"
        ).allowMainThreadQueries()
            .build()
    }
}