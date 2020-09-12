package fr.thomas.tickettracker.database

class Database {

    fun createUserProfil(id: String, username: String, role: String){

    }

    //If empty show all roles
    fun getUsers(usersRole: String = "all"){

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