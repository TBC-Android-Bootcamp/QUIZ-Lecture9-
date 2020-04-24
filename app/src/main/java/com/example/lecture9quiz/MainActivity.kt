package com.example.lecture9quiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users: MutableList<String> = ArrayList()
        var firstName = findViewById<TextView>(R.id.firstName)
        var lastName = findViewById<TextView>(R.id.lastName)
        var age = findViewById<TextView>(R.id.age)
        var email = findViewById<TextView>(R.id.email)

        /* ??? /

        class User constructor(firstName: String, lastName:String, age:String, email:String){
            init {
                users.add(firstName)
                users.add(lastName)
                users.add(age)
                users.add(email)
            }
        }*/

        addUser.setOnClickListener(){
            users.add(firstName.text.toString())
            users.add(lastName.text.toString())
            users.add(age.text.toString())
            users.add(email.text.toString())
            if(email.text.isEmpty() && lastName.text.isEmpty()){
                Toast.makeText(this, "You need to fill everything", Toast.LENGTH_SHORT).show()
            } else if(users.contains(email.text)){
                Toast.makeText(this, "Email already exists", Toast.LENGTH_SHORT).show()
            }
            Toast.makeText(this, "$users", Toast.LENGTH_SHORT).show()
        }

        removeUser.setOnClickListener(){
            users.remove(firstName.text.toString())
            users.remove(lastName.text.toString())
            users.remove(age.text.toString())
            users.remove(email.text.toString())
            Toast.makeText(this, "$users", Toast.LENGTH_SHORT).show()
        }
    }



}
