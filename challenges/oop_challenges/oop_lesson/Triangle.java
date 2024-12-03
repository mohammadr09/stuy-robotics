package oop_lesson;
public class Triangle {
    Point pointA;
    Point pointB;
    Point pointC;

    public Triangle(Point pointA, Point pointB, Point pointC) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.pointC = pointC;
    }

    public double getPerimeter() {
        double A = pointA.getDistance(pointB);
        double B = pointB.getDistance(pointC);
        double C = pointC.getDistance(pointA);

        return A + B + C;
    }

    public double getArea() {
        double A = pointA.getDistance(pointB);
        double B = pointB.getDistance(pointC);
        double C = pointC.getDistance(pointA);

        double s = (A + B + C) / 2;

        return Math.sqrt(s * (s - A) * (s - B) * (s - C));
    }
}