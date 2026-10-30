//overload the employee constructor to initialize the salary to rs 10,000
class Employee3{
    int salary;
    Employee3(){
        salary=10000;
    }
    Employee3(int s){
        salary=s;
    }
    void display(){
        System.out.println("Salary:"+salary);
    }
}
public class Constructoroverload{
    public static void main(String args[]){
        Employee3 e1 =new Employee3();
        Employee3 e2=new Employee3(15000);

        e1.display();
        e2.display();
    }
}
