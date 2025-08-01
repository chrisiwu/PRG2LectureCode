package at.ac.fhcampuswien.block04.examples.example10;

/* Factory:
   - Factory method is a creational design pattern
       that provides an interface for creating objects
       in a superclass, but allows subclasses to alter
       the type of objects that will be created
   - use cases:
       - use the Factory method when you don't know
           beforehand the exact types and dependencies
           of the objects your code should work with:
           e.g. transport system (trains, ships, cars, ...)
       - use the Factory method when you want to provide
           users of your library or framework with a way
           to extend its internal components */
public class ShapeFactory {
    public static Shape getShape(String type) {
        switch (type) {
            case "circle":
                return new Circle();
            case "square":
                return new Square();
            default:
                throw new IllegalArgumentException("Unknown shape.");
        }
    }
}