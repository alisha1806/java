class Movies{
    String hero;
    String heroine;
    String genre;
    String MovieName;
    void display(){
        System.out.println(hero);
        System.out.println(heroine);
        System.out.println(genre);
        System.out.println(MovieName +"\n");
    }

}
public class egproperties {
    public static void main(String[]args){
        Movies m1 = new Movies();
        m1.hero="Naani";
        m1.heroine="Samantha";
        m1.genre="Romance/Revenge";
        m1.MovieName="Naan e";

        Movies m2 = new Movies();
        m2.hero="Naani";
        m2.heroine="Murnal Thakur";
        m2.genre="Comfort";
        m2.MovieName="Hi Naana";

        Movies m3 = new Movies();
        m3.hero="Sk";
        m3.heroine="Samantha";
        m3.genre="Romance/Comedy";
        m3.MovieName="Seemaraja";

        Movies m4 = new Movies();
        m4.hero="Mammoty";
        m4.heroine="Aiswarya rai";
        m4.genre="Comfort";
        m4.MovieName="Kandukonden Kandukonden";

        Movies m5 = new Movies();
        m5.hero="Sk";
        m5.heroine="Sree divya";
        m5.genre="Comedy";
        m5.MovieName="Varuthapadatha Valibar Sangam ";

        m1.display();
        m2.display(); 
        m3.display();
        m4.display();
        m5.display();
        
    }
}
