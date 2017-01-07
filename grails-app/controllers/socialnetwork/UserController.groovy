package socialnetwork

class UserController {

    UserService userService

    def profile() {
        if (session.username) {
            def user = userService.getUserByUsername(params.username)
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
}
