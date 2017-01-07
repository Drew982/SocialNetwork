package socialnetwork

import grails.transaction.Transactional

@Transactional
class LoginService
{
    def getLoginInfo(params)
    {
        String username = params.username //Gives access to data
        String password = params.password //Gives access to data
        int id = getID(username)
        [username: username, password: password, id: id]
    }

    def getID(username){
        User.list().find({it.username == username}).id
    }

    def verifyPassword(userInformation)
    {
        User login = User.get(userInformation.id) //Gives access to ID, username & encrypted password
        login.password == userInformation.password
    }

    def isAdmin(userInformation) {
        User.get(userInformation.id).isAdmin
    }
}
