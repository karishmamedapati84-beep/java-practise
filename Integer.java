//WAP to detect whether a number entered by the user is integer or not
import java.util.Scanner;
class Integer {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number:");
        if(sc.hasNextInt()){
            System.out.println("The number is integer");
        }
        else{
            System.out.println("It is not an integer");
        }
        sc.close();
    }
}
