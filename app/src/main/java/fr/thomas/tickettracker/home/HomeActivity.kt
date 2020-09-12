package fr.thomas.tickettracker.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import fr.thomas.tickettracker.App
import fr.thomas.tickettracker.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val ticketsListFragment = TicketsListFragment()
        val allTicketsListFragment = AllTicketsListFragment()
        val usersListFragment = UsersListFragment()

        when(App.user.role){
            "admin" -> {
                bottom_navigation_view.inflateMenu(R.menu.bottom_nav_menu_admin)
            }
            "tech" -> {
                bottom_navigation_view.inflateMenu(R.menu.bottom_nav_menu_tech)
            }
            "user" -> {
                bottom_navigation_view.inflateMenu(R.menu.bottom_nav_menu_user)
            }
        }

        changeFragment(ticketsListFragment)

        bottom_navigation_view.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.tickets_list -> {
                    changeFragment(ticketsListFragment)
                }
                R.id.all_tickets_list -> {
                    changeFragment(allTicketsListFragment)
                }
                R.id.users_list -> {
                    changeFragment(usersListFragment)
                }
            }
            true
        }
    }



    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
    }
}