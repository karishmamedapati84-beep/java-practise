//Wap to detect double and triple spaces in a string
class Spaces{
    public static void main(String arge[]){
        String mystring="This contains  double and   triple spaces";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));

    }
}