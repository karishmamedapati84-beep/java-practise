//create an array of 5 floats and calculate their sum
class ArraySum {
    public static void main(String[] args) {
        float [] arr={2.0f,4.4f,6.0f,8.0f,22.0f};
        float sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum is:"+sum);
    }
}
