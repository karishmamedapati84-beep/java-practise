//create a class circle with a method to initialize radius,calculating area, perimeter etc
class Circle{
    int radius;
    public double area(){
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
class Calculatingcircle{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.radius=7;
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}