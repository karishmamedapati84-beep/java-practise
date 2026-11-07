//create a class animal and derive another class dog from it
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
    System.out.println("Dog is barking");
}
}
public class InheritanceEx2{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}