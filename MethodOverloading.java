class MethodOverloading {
   static void name(){
    System.out.println("Good morning!");
   }
   static void name(String a){
    System.out.println("Hello " +a);
   }
    public static void main(String[] args) {
        name();
        name("karishma");
    }
}
