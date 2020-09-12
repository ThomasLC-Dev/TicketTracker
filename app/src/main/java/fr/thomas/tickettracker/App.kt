package fr.thomas.tickettracker

import android.app.Application
import com.google.firebase.auth.FirebaseAuth

class App : Application() {

    companion object{
        lateinit var mAuth: FirebaseAuth
    }

    override fun onCreate() {
        super.onCreate()
        mAuth = FirebaseAuth.getInstance()
    }

}