public class Exceptioneg1 {
    public static void main(String[]args){
        try{
            int arr[]={1,2,3,4,5};
            System.out.println(arr[7]);
            //int x=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Array index is out of bounds.");
        }
    }    
}
