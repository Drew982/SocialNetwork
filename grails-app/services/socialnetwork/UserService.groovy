package socialnetwork

import grails.transaction.Transactional

@Transactional
class UserService {

    def getUserByUsername(username)
    {
        User.list().find {it.username == username}
    }
}
