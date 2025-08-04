package at.ac.fhcampuswien.block04.examples.example03.bad_example;

/* bad example:
   - client code breaks if it assumes all birds can fly */
public class Ostrich extends Bird {
    void fly() {
        throw new UnsupportedOperationException(); // ostriches can't fly!
    }
}