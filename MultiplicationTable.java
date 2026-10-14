//Write a java method to print multiplication table of a number n
class MultiplicationTable {
    static void Mul(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n +" * " +i +" = " + n*i );
        }
    }
    public static void main(String[] args) {
         Mul(5);
    }
}
