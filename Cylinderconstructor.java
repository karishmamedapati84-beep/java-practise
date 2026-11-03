//create a class cylinder using a constructor to initilize its radius and height.
class Cylinder{
    int radius;
    int height;

    Cylinder(int r, int h){
        radius = r;
        height = h;
    }
}
public class Cylinderconstructor{
    public static void main(String[] args) {
        Cylinder c = new Cylinder(10,5);
        System.out.println(c.radius);
        System.out.println(c.height);
    }
}