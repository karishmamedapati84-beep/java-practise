import java.util.Scanner;
class Strings{
    public static void main(String args[]){
        String name=new String("Karishma");
       // String name="Hello";
        System.out.print("The name is: ");
        System.out.print(name);
        int a=6;
        float b=5.6454f;
        System.out.printf("The value of a is %d and the value of b is %f",a,b);
        System.out.format("The value of a is %d and the value of b is %f",a,b);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter:");
        String st=sc.next();
        //String st=sc.nextLine();
        System.out.println(st);
        sc.close();
    }
}