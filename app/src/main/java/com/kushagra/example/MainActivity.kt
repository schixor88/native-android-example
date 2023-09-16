package com.kushagra.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO 3 create objects here to pass user registration service
        val userRepository = UserRepository()
        val emailService = EmailService()

        //creating object of user reg service
        //TODO 4 Update constructor, manual DI achieved
        val userRegistrationService = UserRegistrationService(userRepository, emailService)
        //register the user
        userRegistrationService.registerUser("kushagra@gmail.com","123123")

    }
}