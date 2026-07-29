//WAP to calculate CGPA using marks of three subjects.(out of 100).
import java.util.Scanner;
class CGPACalc {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject 1:");
        int sub1=sc.nextInt();
        System.out.println("Enter marks of subject 2:");
        int sub2=sc.nextInt();
        System.out.println("Enter marks of subject 3:");
        int sub3=sc.nextInt();
        int total=sub1+sub2+sub3;
        double avg=total/3.0;
        System.out.println("The average of 3 subjects:"+avg);
        double CGPA=avg/9.5;
        System.out.println("The CGPA is:"+CGPA);
        sc.close();
    }
}
