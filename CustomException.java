class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}
public class CustomException {
    static void withdraw(int balance) throws LowBalanceException{
        if (balance<1000){
            throw new LowBalanceException("Balance is too low");
        }
        System.out.println("Withdrawal successful");
    }
    public static void main(String[]args){
        try{
            withdraw(5000);
        }
        catch(LowBalanceException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I have created a custom Exception");
        }
    }
}
