//WAP which asks the user to enter his/her name and greets them with "Hello <name>,have a good day" text
import java.util.Scanner;
class Greets {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Hello "+name+",have a good day");
        sc.close();
    }
}
