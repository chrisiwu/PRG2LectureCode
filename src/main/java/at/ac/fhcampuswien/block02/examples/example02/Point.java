package at.ac.fhcampuswien.block02.examples.example02;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Double calcDistance(Point point) {
        int a = point.getX() - this.getX();
        int b = point.getY() - this.getY();

        double c = Math.sqrt(a * a + b * b);

        return c;
    }

    public boolean compare(Point p) {
        return (this.x == p.getX() && this.y == p.getY());
    }

    public String toString() {
        return "x=" + this.getX() + " y=" + this.getY();
    }
}