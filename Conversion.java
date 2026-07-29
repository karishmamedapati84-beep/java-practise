//WAP to convert Kilometer to miles.
import java.util.Scanner;
class Conversion {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Kilometers:");
        double KM=sc.nextDouble();
        double miles=KM*0.621371;                           //1km=0.621371miles
        System.out.println("The distance in miles:"+miles+"miles");
        sc.close();
    }
}
