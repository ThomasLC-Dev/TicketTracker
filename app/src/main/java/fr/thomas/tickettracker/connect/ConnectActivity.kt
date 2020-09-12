package fr.thomas.tickettracker.connect

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import fr.thomas.tickettracker.App
import fr.thomas.tickettracker.R
import fr.thomas.tickettracker.home.HomeActivity
import kotlinx.android.synthetic.main.activity_connect.*

class ConnectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect)

        if (App.mAuth.currentUser != null){
            startHomeActivity()
        }

        btn_sign_in.setOnClickListener {
            var email = et_activity_connect_email.text.toString()
            var password = et_activity_connect_password.text.toString()
            if(!email.isEmpty() && !password.isEmpty()){
                connectUser(email, password)
            }
            else{
                Toast.makeText(this, "Empty field !", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun connectUser(email: String, password: String){
        App.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
            if(it.isSuccessful){
                startHomeActivity()
            }
            else{
                Toast.makeText(this, "Wrong email or password !", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun startHomeActivity(){
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
    }
}