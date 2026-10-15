/* WAP using functions to print the folowing pattern:
*
* *
* * *
* * * *

*/
class PatternUsingFunction {
    static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern(4);
    }
}
