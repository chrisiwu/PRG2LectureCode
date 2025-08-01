package at.ac.fhcampuswien.block04.examples.example08;

/* Builder:
   - Builder is a creational design pattern that lets
       you construct complex objects step by step.
       The pattern allows you to produce different types
       and representations of an object using the
       same construction code.
   - use cases:
       - use the Builder pattern to get rid of a
           "telescopic constructor" (multiple optional parameters,
           or multiple constructors for every field)
       - use the Builder pattern when you want your code
           to be able to create different representations of some product */
public class User {
    private String username;
    private String email;
    private int age;
    private boolean newsletter;

    private User(UserBuilder builder) { // builder is passed to constructor of User
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
        this.newsletter = builder.newsletter;
    }

    // nested class inside User class
    // Builder class
    public static class UserBuilder {
        private String username;
        private String email;
        private int age;
        private boolean newsletter;

        public UserBuilder(String username) {
            this.username = username;
        }

        public UserBuilder email(String email) {
            this.email = email;
            return this; // each function needs to return the Builder itself
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this; // each function needs to return the Builder itself
        }

        public UserBuilder newsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this; // each function needs to return the Builder itself
        }

        // build() returns a new object of User
        public User build() {
            return new User(this);
        }
    }
}