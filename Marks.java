/* Write a program to find out whether a student is pass or fail.
 If it requires that 40% and at least 33% in each subject to pass. 
 Assume three subjects and take marks as an input from the user.
*/

import java.util.Scanner;
class Marks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter sub1 Marks:");
        int sub1=sc.nextInt();
        System.out.println("Enter sub2 Marks:");
        int sub2=sc.nextInt();
        System.out.println("Enter sub3 Marks:");
        int sub3=sc.nextInt();
        float avg=(sub1+sub2+sub3)/3.0f;
        System.out.println("Your overall percentage is:"+avg);
        if (avg >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
