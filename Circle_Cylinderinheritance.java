//create a class circle and use inheritance to create another class cylinder from it
class Circle {
    double radius;
    Circle(double r) {
        radius = r;
    }
    void area() {
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }
}
class Cylinder extends Circle {
    double height;
    Cylinder(double r, double h) {
        super(r);
        height = h;
    }
    void volume() {
        System.out.println("Volume of Cylinder: " +
                (3.14 * radius * radius * height));
    }
}
class Circle_Cylinderinheritance{
    public static void main(String[] args) {
        Cylinder c = new Cylinder(5, 10);
        c.area();
        c.volume();
    }
}