package fr.thomas.tickettracker

import android.app.Application
import com.google.firebase.auth.FirebaseAuth
import fr.thomas.tickettracker.database.Database
import fr.thomas.tickettracker.models.User

class App : Application() {

    companion object{
        lateinit var mAuth: FirebaseAuth
        lateinit var database: Database
        lateinit var user: User
    }

    override fun onCreate() {
        super.onCreate()
        mAuth = FirebaseAuth.getInstance()
        database = Database()
    }

}