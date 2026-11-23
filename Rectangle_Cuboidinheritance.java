//create a class rectangle and use inheritance to create another class cuboid
class Rectangle{
    int length,breadth;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    void Area(){
        System.out.println("Area of Rectangle:" +(length*breadth));
    }
}
class Cuboid extends Rectangle{
    int height;
    Cuboid(int l,int b,int h){
        super(l,b);
        height=h;
    }
    void Volume(){
        System.out.println("Volume of Cuboid:"+(length*breadth*height));
    }
}
class Rectangle_Cuboidinheritance{
    public static void main(String[] args) {
        Cuboid c= new Cuboid(5,3,4);
        c.Area();
        c.Volume();
    }
}