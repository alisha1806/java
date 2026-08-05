// comments are for polymorphism overridding
class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
    void sleep(){
        System.out.println("Animal is sleeping");
    }
}

class dragon extends Animal{
    // @Override
    // void sleep(){
    //     System.out.println("Dragon is sleeping");
    // }
    void walk(){
        System.out.println("Dragon is walking");
    }
}
public class inheritance {
    public static void main(String[] args){
        // Animal a= new dragon();
        // a.sleep();
        dragon fire = new dragon();
        fire.eat();
        fire.sleep();
        fire.walk();
    }
}
