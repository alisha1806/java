interface Animal{
    void sound();
}
class Dino implements Animal{
    public void sound(){
        System.out.println("Booms");
    }
}
public class InterfaceEg {
    public static void main(String[] args){
        Animal a = new Dino();
        a.sound();
    }
}
