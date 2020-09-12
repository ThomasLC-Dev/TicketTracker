package fr.thomas.tickettracker.users

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.thomas.tickettracker.R

class UserDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R
            .layout.activity_user_details)
    }
}