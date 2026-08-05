class Student1{
    private String name;
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
public class encapsulation {
    public static void main(String[]args){
        Student1 s = new Student1();
        s.setName("Alice");
        System.out.println(s.getName());
    }
}
