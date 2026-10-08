//WAP to find whether an array is sorted or not
class SortedArray {
    public static void main(String[] args) {
        boolean isSorted=true;
        int[] arr={1,200,3,5,4,7,90,44,53};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}
