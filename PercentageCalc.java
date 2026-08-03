//Wap to calculate the percentage of a given student in CBSE board exam.His marks from 5 subjects
//must be taken as input from the keyboard(marks are out of 100).

import java.util.Scanner;
class PercentageCalc {
    public static void main(String args[]){
        System.out.println("Student Marks");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Mathematics Marks:");
        int s1=sc.nextInt();
        System.out.println("Enter Physics Marks:");
        int s2=sc.nextInt();
        System.out.println("Enter Chemistry Marks:");
        int s3=sc.nextInt();
        System.out.println("Enter IT Marks:");
        int s4=sc.nextInt();
        System.out.println("Enter English Marks:");
        int s5=sc.nextInt();
        int total=s1+s2+s3+s4+s5;
        double Percentage=(total/500.0)*100;
        System.out.println("The total:"+total);
        System.out.println("Percentage is"+Percentage+"%");
        sc.close();
    }
}
