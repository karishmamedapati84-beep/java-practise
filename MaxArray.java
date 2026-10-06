//WAP to find the maximum element in an array
class MaxArray {
    public static void main(String[] args) {
        int [] arr={5,10,15,20,25,30};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The maximum is "+max);
    }
}
