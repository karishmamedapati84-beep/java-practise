class Employee{
        int id;
        String name;
        public void printDetails(){
            System.out.println("My id is:" +id);
            System.out.println("My name is:"+name);
        }
    }
    class Customclass{
    public static void main(String[] args) {
        Employee e1=new Employee();  //instantiating a new employee object
        Employee e2=new Employee();
        
        //setting attributes
        e1.id=12;
        e1.name="Karishma";

        e2.id=13;
        e2.name="Mahi";
        
        //printing the attributes
        e1.printDetails();
        e2.printDetails();

        // System.out.println(e1.id);
        //System.out.println(e1.name);
    }
}