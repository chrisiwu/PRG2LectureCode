package at.ac.fhcampuswien.block04.examples.example01.bad_example;

public class UserManager {
    public void saveUser(User user) {
        // save user to DB
    }

    public boolean validateEmail(String email) {
        // validate email format
        return email.contains("@");
    }
}
