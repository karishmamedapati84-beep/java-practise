//Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom paraameters
class Rectangle{
    int length;
    int breadth;
    Rectangle(){
        length=4;
        breadth=5;
    }
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
}
public class Rectangleconstructor {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        Rectangle r1=new Rectangle(20,30);
        System.out.println(r.length);
        System.out.println(r.breadth);
        System.out.println(r1.length);
        System.out.println(r1.breadth);
    }
}