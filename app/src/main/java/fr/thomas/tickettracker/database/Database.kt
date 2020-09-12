package fr.thomas.tickettracker.database

import fr.thomas.tickettracker.models.User

class Database {

    fun createUserProfil(id: String, username: String, role: String){

    }

    //If empty show all roles
    fun getUsers(usersRole: String = "all"){

    }

    fun getUser(userId: String): User{
        return User("userId", "test@test.fr", "Test user", "admin")
    }

    fun createTicket(){

    }

    //Change status or attribute to a tech
    fun updateTicket(){

    }

    //For get...Tickets : if ticketsStatus is empty, show all tickets
    fun getAllTickets(ticketsStatus: Int = -1){

    }

    fun getAttributedTickets(techId: String, ticketsStatus: Int = -1){

    }

    fun getCreatedTickets(userId: String, ticketsStatus: Int = -1){

    }

}