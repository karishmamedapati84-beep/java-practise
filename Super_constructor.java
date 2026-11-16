//Example3-calling the parent class constructor
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
}

class Child extends Parent {
    Child() {
        super();
        System.out.println("Child constructor");
    }
}
class Super_constructor{
    public static void main(String[] args) {
        Child c2 = new Child();
    }
}