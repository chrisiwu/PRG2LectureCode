package at.ac.fhcampuswien.block04.examples.example04.bad_example;

public class Robot implements Worker {
    @Override
    public void work() {
        /* robot works */
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException();
    }
}