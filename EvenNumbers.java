//WAP to sum first n even numbers using while loop
class EvenNumbers {
    public static void main(String[] args) {
        int sum=0;
        int i=1;
        int n=4;
        while(i<=n){
            sum=sum+(2*i);
             i++;
        }
        System.out.println("Sum of first even numbers is:" +sum);
    }
}
