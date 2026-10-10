class VarArgs {
    public static int sum(int ...arr){
        int result=0;
        for(int a: arr){
        result+=a;
    }
    return result;
}
    public static void main(String[] args) {
        System.out.println("The sum of nothing is:"+sum());
        System.out.println("The sum of 1,2 is:"+sum(1,2));
        System.out.println("The sum of 1,2,3 is:"+sum(1,2,3));
        System.out.println("The sum of 1,2,3,4 is:"+sum(1,2,3,4));
        System.out.println("The sum of 1,2,3,4,5 is:"+sum(1,2,3,4,5));
    }    
}
