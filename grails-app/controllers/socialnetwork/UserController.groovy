package socialnetwork

class UserController {

    UserService userService

    def profile() {
        if (session.username) {
            println (params)
            def user = userService.getUserByUsername(params.username)
            render(view: "userprofile", model: [user: user])
        }
        else {
            redirect(uri: "/view/login") //Returns to login page if failure
        }
    }
}
