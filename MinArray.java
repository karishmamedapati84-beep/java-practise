//WAP to find the minimum element in an array
class MinArray {
    public static void main(String[] args) {
        int [] arr={5,10,15,20,25,30};
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The minimum is "+min);
    }
}
