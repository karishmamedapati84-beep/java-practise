// WAP to find whether a year entered by the user is a leap year or not

import java.util.Scanner;

class LeapYear {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Year:");
        int x = sc.nextInt();

        if (x % 400 == 0) {
            System.out.println(x + " is a leap year");
        }
        else if (x % 100 == 0) {
            System.out.println(x + " is not a leap year");
        }
        else if (x % 4 == 0) {
            System.out.println(x + " is a leap year");
        }
        else {
            System.out.println(x + " is not a leap year");
        }

        sc.close();
    }
}