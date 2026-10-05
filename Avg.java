//Calculate the average marks from an array containing marks of all students in physics using for each loop
class Avg {
    public static void main(String[] args) {
        int [] marks={50,70,59,60,89,78};
        int sum=0;
        int avg=0;
        for(int element:marks){
            sum=sum+element;
            avg=sum/marks.length;
        }
        System.out.println("The average is:"+avg);
    }  
}
