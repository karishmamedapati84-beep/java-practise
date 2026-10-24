//create a class square with a method to initilize its side,calculating area, perimeter etc
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class Calculatingsquare{
    public static void main(String args[]){
        Square s=new Square();
        s.side=5;
        System.out.println(s.area());
        System.out.println(s.perimeter());
    }
}