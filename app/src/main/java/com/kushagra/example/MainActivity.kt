package com.kushagra.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //creating object of user reg service
        val userRegistrationService = UserRegistrationService()
        //register the user
        userRegistrationService.registerUser("kushagra@gmail.com","123123")

    }
}