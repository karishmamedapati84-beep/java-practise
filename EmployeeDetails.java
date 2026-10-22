/* create a class Employee1 with following properties and methods
Salary(property)(int)
get salary(method returning int)
name(property)(string)
getname(method returning string)
setname(method changing name)
*/
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
}
class EmployeeDetails{
    public static void main(String[] args) {
        Employee1 e1=new Employee1();
        e1.salary=50000;
        e1.setName("Karishma");
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());
    }
}