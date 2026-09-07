/* Calculate income tax paid by an employee to the government as per the slabs mentioned below:
Income Slab                   Tax
2.5L - 5.0L                   5%
5.0L - 10.0L                  20%
Above 10.0L                   30%
Note that there is no tax below 2.5L. Take input amount as an input from the user. */

import java.util.Scanner;
class IncomeTax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs:");
        double income = sc.nextDouble();
        double tax = 0;

        if (income <= 2.5) {
            tax = 0;
        }
        else if (income <= 5.0) {
            tax = (income - 2.5) * 0.05;
        }
        else if (income <= 10.0) {
            tax = (2.5 * 0.05) + (income - 5.0) * 0.20;
        }
        else {
            tax = (2.5 * 0.05) + (5.0 * 0.20) + (income - 10.0) * 0.30;
        }

        System.out.println("Income Tax = " + tax + " lakhs");
        sc.close();
    }
}