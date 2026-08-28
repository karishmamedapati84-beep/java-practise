class Logical{
    public static void main(String args[]){
        System.out.println("For Logical And....");
        boolean a=true;
        boolean b=false;
        boolean c=true;
        if(a&&b&&c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.println("For Logica Or....");
        if(a||b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        System.out.println("For logical not");
        System.out.println("Not(A) is " + !a);
        System.out.println("Not(B) is " + !b);
    }
}
