class Employee2{
    private int id;
    private String name;

    public void setId(int i){
        id=i;
    }
    public void setName(String n){
        name=n;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }   
}
public class Gettersetter {
    public static void main(String[] args) {
        Employee2 e2=new Employee2();
        e2.setName("Karishma");
        e2.setId(1);
        System.out.println(e2.getName());
        System.out.println(e2.getId());
    }
}