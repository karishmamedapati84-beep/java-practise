class Student {
    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }
}
public class Constructor {
       public static void main(String[] args) {
        Student s = new Student("Ravi", 20);

        System.out.println(s.name);
        System.out.println(s.age);
    }
}