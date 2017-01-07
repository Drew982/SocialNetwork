package socialnetwork

class User {

    static constraints = {
        username(unique: true)
        description(nullable: true)
    }

    String username
    String password
    String description
    boolean isAdmin
    int age
    int height

}
