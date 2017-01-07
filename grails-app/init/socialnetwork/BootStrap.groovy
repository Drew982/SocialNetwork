package socialnetwork

class BootStrap {

    def init = { servletContext ->
        new User(username: "Andrew", password: "123", description: "Me", age: 22, height: 6, isAdmin: true).save()
        new User(username: "John", password: "234", description: "Him", age: 24, height: 6, isAdmin: false).save()
    }
    def destroy = {

    }
}
