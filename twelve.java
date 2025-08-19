// Q12. Final variable with constructor
class User {
    final int userId;

    User(int id) {
        this.userId = id; // must be initialized here
    }

    public static void main(String[] args) {
        User u = new User(101);
        System.out.println("User ID: " + u.userId);
    }
}
