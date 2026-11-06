import javax.sound.sampled.SourceDataLine;

class Parent{
    int money=50000;
    void display(){
        System.out.println("Parents money:"+money);
    }
}
class Child extends Parent{
    void show(){
    System.out.println("I am a child");
}
}
public class Inheritance{
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
        c.show();
    }
}