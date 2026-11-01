//create a class cylinder and us getters and setters to set its radius and height and calculate the surface area and volume of the cylinder
class Cylinder1{
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
    public double volumeOfCylinder(){
        return Math.PI*radius*radius*height;
    }
    public double surfaceAreaOfCylinder(){
        return 2*Math.PI*radius*(radius+height);
    }
}
public class Calculatingcylinder{
    public static void main(String[] args) {
        Cylinder1 c1=new Cylinder1();
        c1.setHeight(10);
        c1.setRadius(5);
        System.out.println("Volume of  cylinder "+ c1.volumeOfCylinder());
        System.out.println("Surface area of cylinder " +c1.surfaceAreaOfCylinder());
    }
}