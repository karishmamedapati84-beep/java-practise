//create a class sphere and use getters and setters to set its radius 
class Sphere{
    int radius;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius=r;
    }
}
public class Getsetsphere{
    public static void main(String[] args) {
        Sphere s=new Sphere();
        s.setRadius(10);
        System.out.println(s.getRadius());
    }
}