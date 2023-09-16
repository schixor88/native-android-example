package com.kushagra.example

class UserRegistrationService(
    //TODO 2. moved here
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

// TODO 1. moving these object creation to the constructor to achieve constructor injection
//    private val userRepository = UserRepository()
//    private val emailService = EmailService()
//



    fun registerUser(email:String, password:String){
        //save user to repo
        userRepository.saveToDb(email, password)
        //send email after saving
        emailService.send(email,"from@gmail.com","hi")
    }
}

/**
* Unit Testing
* Single Responsibility
* Lifetime of objects
* Extensible
* */