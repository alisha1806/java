public class forthrow {
    public static void main(String[]args){
        try{
             int age=19;
        if (age<18){
            throw new ArithmeticException("Not eligible");
        }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Eligible");
    }
}
