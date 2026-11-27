interface Animal{
    void sound(); //Method Declaration
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}
public class Interface{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.sound();
    }
}