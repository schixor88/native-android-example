# Native Android Application

Repository created with an intent to cover famous/popular interview questions with their practical implementation

### Topics 
- Dependency Injection : Dagger 2
- Coroutines
- Flow
- Room
- SOLID
- Clean Code


# Manual DI

Here the user registration service registers a user
while registering 2 things happen : save user to db & send email to user after saving

Email Service is responsible to send email
User Repository is responsible to save user

User Registration Service creates object of email service and user repo inside it
This is not dependency injection

This is not a good practice, even though it works

In st1/manual-di this is fixed with di
