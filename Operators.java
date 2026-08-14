class Operators{
    public static void main(String args[]){
        //1)Arithmetic Operators
        int a=5;
        int b=10+a;
        int c=10-a;
        int d=a%2;
        int e = a/2;
        System.out.println("a:"+a +" b:"+b +" c:"+c +" d:"+d +" e:"+e);
         //2)Assignment Operator
         int q=2;
         q +=2;
         System.out.println("q:"+q);
         //3)Comparision Operators
         int p=2;
         int r=5;
         System.out.println(p==r);
         System.out.println(p>=r);
         System.out.println(p<=r);
         //4)Logical Operators
         System.out.println(64>5 && 65>99 );
         System.out.println(64>5 || 68>99 );
         //5)Bitwise operator
         System.out.println(2&3);
    }
}