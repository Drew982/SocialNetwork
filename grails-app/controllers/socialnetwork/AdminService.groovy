package socialnetwork

import grails.transaction.Transactional

@Transactional
class AdminService {

    /****************************READ************************/
    def getUsers()
    {
        User.list()
    }
}
