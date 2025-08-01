package at.ac.fhcampuswien.block04.examples.example04.good_example;

/* Interface Segregation Principle:
   - clients should not be forced
       to depend on methods they don't use
   - make your interfaces small and focused
   - split large interfaces into more specific ones */
public class Robot implements Workable {
    @Override
    public void work() {

    }
}