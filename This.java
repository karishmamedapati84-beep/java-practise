class Student{
    int id;
    Student(int id){
        this.id=id;
    }
    void display(){
        System.out.println("ID:"+this.id);
    }
}
class This{
    public static void main(String args[]){
        Student s1=new Student(101);
        s1.display();
    }
}