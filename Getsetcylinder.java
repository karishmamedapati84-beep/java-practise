//create a class cylinder and us getters and setters to set its radius and height
class Cylinder{
    int radius;
    int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height=h;
    }
}
public class Getsetcylinder{
    public static void main(String[] args) {
        Cylinder c1=new Cylinder();
        c1.setHeight(10);
        c1.setRadius(5);
        System.out.println(c1.getHeight());
        System.out.println(c1.getRadius());
    }
}