package at.ac.fhcampuswien.block04.examples.example08;

public class Example08 {
    User user = new User.UserBuilder("alice").
            email("alice@example.com").
            age(30).
            newsletter(true).
            build();
}