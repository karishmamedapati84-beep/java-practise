//WAP to find out whether a given integer is present in an array or not
class CheckInteger {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int num =30;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("The given integer is present in the array");
        }
        else{
            System.out.println("The integer is not present in the array");
        }
    }
}
