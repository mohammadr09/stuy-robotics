package oop_lessons;
public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3.0, 4.0);
        Point p2 = new Point(1.0, 2.0);

        double distance = p1.getDistance(p2);
        System.out.println(distance); // --> 2.8284271247461903

        // Triangle
        Point a = new Point(3, 4);
        Point b = new Point(420, 694);
        Point c = new Point(0, 4);

        Triangle t = new Triangle(a, b, c);
        System.out.println(t.getPerimeter()); // --> 1616.993673960766
        System.out.println(t.getArea()); // --> 1035.0000000000477

        // HW - Human Class
        
    } 
}
