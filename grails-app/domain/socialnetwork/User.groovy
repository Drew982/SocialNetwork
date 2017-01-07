package socialnetwork

class User {

    static constraints = {
        username(unique: true)
        description(size: 0..500)
    }

    String username
    String password
    String description
    boolean isAdmin
    int age
    int height

}
