//WAP to print the elements of an array in reverse order
class ReverseArray {
    public static void main(String[] args) {
        int[] marks={98,95,92,80,75,73,65,62,50};
        for(int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
    }
}
