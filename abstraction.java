abstract class Shape{
    abstract void draw();
}
class triangle extends Shape{
    void draw(){
        System.out.println("Drawing a triangle");
    }
}
public class abstraction {
    public static void main(String[] args){
        Shape s = new triangle();
        s.draw();
    }
}
