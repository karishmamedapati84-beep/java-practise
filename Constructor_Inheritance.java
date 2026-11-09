class Parent{
    Parent(){
        System.out.println("I am parent constructor");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("I am child constructor");
    }
}
public class Constructor_Inheritance{
    public static void main(String[] args) {
        Child c= new Child();
    }
}