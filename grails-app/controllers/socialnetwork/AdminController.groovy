package socialnetwork

class AdminController {

    AdminService adminService

    def list() {
        if (session.username) {
            def users = adminService.getUsers()
//            render("Hello")
            render(view: "useradmin", model: [users: users])
        }
        else {
            redirect(uri: "/view/login") //Returns to login page if failure
        }
    }
}
