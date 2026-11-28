interface Animal {

    default void sound() {
        System.out.println("Animal makes sound"); // method already implemented here
    }
}

class Dog implements Animal {
    // No need to write sound() method again
}

public class Default_Method {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.sound();
    }
}