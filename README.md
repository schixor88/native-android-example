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

User Registration is changed to accept objects as injection
This is manual DI

User Repo and Email Service are created and passed as parameters

The following points are made possible with DI

- Unit Testing
- Single Responsibility
- Lifetime of objects
- Extensible


But manual di is not sufficient due to various reasons among which the need to create a lot of objects while creating classes is one of them
So for the same we will use Dagger 2 

t1/di/st3/dagger/inject-component 
