package at.ac.fhcampuswien.block02.examples.example02;

public class Line {
    private Point startPoint;
    private Point endPoint;

    public Line() {
    }

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Double calculateLength() {
        int a = this.startPoint.getX() - this.endPoint.getX();
        int b = this.startPoint.getY() - this.endPoint.getY();

        double c = Math.sqrt(a * a + b * b);

        return c;
    }
}