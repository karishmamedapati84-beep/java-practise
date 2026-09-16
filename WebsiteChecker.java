/*Write a program to find out the type of website from the URL.

.com → Commercial website
.org → Organization website
.in → Indian website */

import java.util.Scanner;

class WebsiteChecker{

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the url:");
        String url= sc.next();
        if(url.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if (url.endsWith(".org")) {
            System.out.println("Organization Website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Not a valid Website");
        }
        sc.close();
    }
}