package socialnetwork

class UrlMappings {

    static mappings = {
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/view/login"(view: "login/login")
        "/view/logout"(view: "login/logout")
        "/view/signup"(view: "login/signup")
        "/view/list"(view: "admin/useradmin")

        "/admin/useradmin"(controller: "admin", action: "list")

        "/controller/login"(controller: "login", action: "login")
        "/controller/logout"(controller: "login", action: "logout")
        "/controller/signup"(controller: "login", action: "signup")
    }
}
