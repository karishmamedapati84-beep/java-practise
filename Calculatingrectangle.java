//create a class rectangle with a method to initilize length and breadth,calculating area, perimeter etc
class Rectangle{
    int length,breadth;
    public int area(){
        return length*breadth;
    }
    public int perimeter(){
        return 2*(length+breadth);
    }
}
class Calculatingrectangle{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=6;
        r1.breadth=4;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }
}