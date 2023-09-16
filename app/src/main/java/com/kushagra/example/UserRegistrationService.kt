package com.kushagra.example

class UserRegistrationService {

    private val userRepository = UserRepository()
    private val emailService = EmailService()


    fun registerUser(email:String, password:String){
        //save user to repo
        userRepository.saveToDb(email, password)
        //send email after saving
        emailService.send(email,"from@gmail.com","hi")
    }
}