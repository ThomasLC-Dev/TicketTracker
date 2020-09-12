package fr.thomas.tickettracker.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.thomas.tickettracker.App
import fr.thomas.tickettracker.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}