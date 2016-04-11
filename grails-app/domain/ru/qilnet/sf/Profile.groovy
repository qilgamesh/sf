package ru.qilnet.sf

class Profile {
    
    static belongsTo = User
    
    String name
    String email

    static constraints = {
        name(nullable: true)            
        email(email: true, nullable: true)
    }
}
