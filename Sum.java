//WAP to sum 3 numbers in java.
import java.util.Scanner;
class Sum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number 1: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int Sum = num1+num2+num3;
        System.out.println("The sum is:"+Sum);
        sc.close();
    }   
}
