package oop_lessons;
public class Point {
    double x;
    double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point toPoint) {
        return Math.sqrt(Math.pow(this.x - toPoint.x, 2) + Math.pow(this.y - toPoint.y, 2));
    }
}