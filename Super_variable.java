//Example-2 calling the parent class varable
class Parent{
    int a=10;
}
class Child extends Parent{
    int a=20;
    void display(){
        System.out.println(super.a);
        System.out.println(a);
    }
}
class Super_variable{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.display();
    }
}