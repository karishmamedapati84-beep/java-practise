//Use comparision operator to find out whether a given number is greater than the user entered number or not
import java.util.Scanner; 
class Greater{
    public static void main(String args[]){
        int a=10;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println(a>num);
        sc.close();
    }
}