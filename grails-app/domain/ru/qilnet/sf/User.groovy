package ru.qilnet.sf

class User {
    
    String userId
    String password
    Date dateCreated
    Date lastUpdated
    
    Profile profile

    static constraints = {
        userId(size:3..20, unique: true, matches: '^[A-Za-z][A-Za-z0-9]')
        password(size: 6..20, 
            validator: { passwd, user -> 
                return passwd != user.userId 
            }
        )
        profile(nullable: true)
    }
    
    static mapping = {
        profile lazy: false
    }
}
