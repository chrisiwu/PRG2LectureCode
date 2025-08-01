package at.ac.fhcampuswien.block04.examples.example10;

public class Example10 {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape("circle");

        shape.draw();
    }
}