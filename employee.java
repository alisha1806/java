class Person{
    private double salary;
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
}
public class employee {
    public static void main(String[]args){
        Person e = new Person();
        e.setSalary(50000);
        System.out.println(e.getSalary());
    }
}