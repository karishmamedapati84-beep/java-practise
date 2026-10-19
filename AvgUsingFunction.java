//Write a function to find average of a set of numbers passed as arguments
class AvgUsingFunction {
    static void Avg(int ...arr){
        int sum=0;
        for(int a: arr){
            sum=sum+a;
        }
        int Avg=sum/arr.length;
          System.out.println("The avg is: "+Avg);
    }
    public static void main(String[] args) {
        Avg(2,3,4,5,6,7,8,9);
    }
    
}
