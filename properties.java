class Student{
    int id;
    String name;

    void display(){
        System.out.println(name);
        System.out.println(id);
    }
}
public class properties {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="alisha";
        s1.id=11;

        Student s2 = new Student();
        s2.name="kanta";
        s2.id=13;

        Student s3 = new Student();
        s3.name="avanthika";
        s3.id=14;

        Student s4 = new Student();
        s4.name="hema";
        s4.id=15;

        Student s5 = new Student();
        s5.name="anu";
        s5.id=16;


        s1.display();
        s2.display();
        s3.display();
        s4.display();
        s5.display();
    }
}
