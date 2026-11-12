//Example-1 Calling parent class method
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        super.eat();
        System.out.println("DOg is barking");
    }
}
class Super{
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
    }
}
