class Student{
    int id;
    String name;
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id);
        System.out.println(name+"\n");
    }
}
public class constructor {
    public static void main(String[]args){
        Student s =new Student(1, "Alice");
        Student s1 =new Student(2, "Bob");
        s.display();
        s1.display();
    }
}
