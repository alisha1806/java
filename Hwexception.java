class PlacementException extends Exception{
    public PlacementException(String msg){
        super(msg);
    }
}
public class Hwexception {
    static void checkcgpa(double cgpa) throws PlacementException{
        if(cgpa>7.00){
                throw new PlacementException("Eligible for placement");
        }
        System.out.println("Not eligible for placement");
    }
    public static void main(String[] args){
        try{
            checkcgpa(6.87);
        }
        catch(PlacementException e){
                System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I have created a Exception for placement");
        }
    }
}
