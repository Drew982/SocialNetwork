package socialnetwork

import grails.transaction.Transactional

@Transactional
class UserService {

    def getUserByUsername(username)
    {
        User.list().find {it.username == username}
    }

    def createNewUser(username, password)
    {
        new User(username: username, password: password, isAdmin: false, description: "").save(failOnError: true) //Saves new user
    }
}
