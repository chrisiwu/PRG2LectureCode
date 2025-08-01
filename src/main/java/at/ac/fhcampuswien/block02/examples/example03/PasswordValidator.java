package at.ac.fhcampuswien.block02.examples.example03;

public class PasswordValidator {
    public boolean isValid(String password) {
        if (password == null) {
            throw new IllegalArgumentException();
        }

        return password.length() >= 6;
    }

    public String showMessage(boolean isPasswordValid) {
        if (isPasswordValid) {
            return "Login successful.";
        } else {
            return "Login failed.";
        }
    }
}