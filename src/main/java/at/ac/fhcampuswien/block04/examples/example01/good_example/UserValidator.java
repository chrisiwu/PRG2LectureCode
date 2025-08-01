package at.ac.fhcampuswien.block04.examples.example01.good_example;

/* Single Responsibility Principle:
   - classes should have only one reason to change
       = must have only one responsibility
   - all elements in a given class should have
       functional affinity to each other */
public class UserValidator {
    public boolean validateEmail(String email) {
        return email.contains("@");
    }
}