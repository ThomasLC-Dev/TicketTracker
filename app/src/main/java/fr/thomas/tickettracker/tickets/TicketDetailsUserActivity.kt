package fr.thomas.tickettracker.tickets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import fr.thomas.tickettracker.R

class TicketDetailsUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket_details_user)
    }
}