class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}
public class Dynamic_method{
    public static void main(String[] args) {
         //Phone obj = new Phone(); //Allowed
        //SmartPhone smobj= new SmartPhone(); //ALlowed
        //obj.name();

       Phone obj = new SmartPhone();   //It is also allowed
       //SmartPhone obj2 = new Phone(); // Not allowed

       obj.showTime();
       obj.on();
       //obj.music(); //Not allowed


    }
}