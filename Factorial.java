//WAP to find the factorial of a given number using for loops
class Factorial {
    public static void main(String[] args) {
        int fact=1;
        int n=5;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of " +n +" is " +fact);
    }
}
