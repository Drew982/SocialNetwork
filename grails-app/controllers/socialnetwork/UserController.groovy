package socialnetwork

import grails.converters.JSON

class UserController {

    UserService userService

    def profile() {
        if (session.username) {
            def user = userService.getUserByUsername(session.username)
            render(view: "userprofile", model: [user: user])
        }
        else {
            redirect(uri: "/view/login") //Returns to login page if failure
        }
    }

    def createNewUser() {
        userService.createNewUser(params.username, params.password) //Creates new user with login info
        redirect(uri: "/view/login") //Returns to login page if failure
    }

    def update() {
        userService.update(params.id, params.age, params.height, params.description)
        redirect(controller: "user", action: "profile")
    }

    def getUser(){
        def user = userService.getUserByUsername(session.username)
        render(user as JSON)
    }
}
