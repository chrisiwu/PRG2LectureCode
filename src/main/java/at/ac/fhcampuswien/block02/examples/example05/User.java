package at.ac.fhcampuswien.block02.examples.example05;

public class User {
    private String name;
    private boolean isActive;

    public User(String name) {
        this.name = name;
        this.isActive = false;
    }

    public User(String name, boolean isActive) {
        this.name = name;
        this.isActive = isActive;
    }

    public boolean isActive() {
        return this.isActive;
    }
}