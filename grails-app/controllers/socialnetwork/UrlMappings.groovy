package socialnetwork

class UrlMappings {

    static mappings = {
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/view/login"(view: "login/login")
        "/view/logout"(view: "login/logout")
        "/view/newuser"(view: "user/newuser")

        "/admin/useradmin"(controller: "admin", action: "list")
        "/user/userprofile"(controller: "user", action: "profile")
        "/user/createnewuser"(controller: "user", action: "createNewUser")

        "/controller/login"(controller: "login", action: "login")
        "/controller/logout"(controller: "login", action: "logout")
    }
}
