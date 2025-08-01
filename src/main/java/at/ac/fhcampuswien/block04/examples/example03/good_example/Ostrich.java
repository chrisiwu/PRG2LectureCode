package at.ac.fhcampuswien.block04.examples.example03.good_example;

/* Liskov Substition Principle:
   - every child class should be substitutable
       for their base types without altering program correctness
   - code smells:
       - subtypes throw exceptions for a behavior it cannot fulfill
       - subtypes implement methods that do nothing
       - the client has to handle uncorrect cases differently. */

/* good example:
   - doesn't fly, but LSP is not violated */
public class Ostrich implements Bird {
    // doesn't fly, but LSP is not violated
}