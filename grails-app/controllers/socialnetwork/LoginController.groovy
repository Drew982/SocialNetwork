package socialnetwork

class LoginController {

    LoginService loginService

    def login() {
        if (session.username) { //Checks session
            render("Session Created")
//            redirect(controller: "", action: "") //Redirects to /user/admin page if successful login
        }
        else
        {
            def userInformation = loginService.getLoginInfo(params)

            if (loginService.verifyPassword(userInformation))
            {
                session.username = userInformation.username
                session.removeAttribute("loginFailed") //Remove loginFailure notice after successful login
//                redirect(controller: "user", action: "admin") //Redirects to /user/admin page if successful login

                if(loginService.isAdmin(userInformation)) {
//                    render("Hello")
                    redirect(controller: "admin", action: "list")
                }
                else
                {
                    render("User profile")
                }
            }
            else
            {
                session.loginFailed = true
                redirect(uri: "/view/login") //Returns to login page if failure
            }
        }
    }

    def logout() {
        session.removeAttribute("username")
        redirect(uri: "/view/login") //Returns to login page if failure
    }

    def signup() {

    }
}
