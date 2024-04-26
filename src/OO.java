class Movie{
    String title;
    String genre;//instancia os objetos
    int rating;

    void playIt(){
        System.out.println("Playing Movie");
    }
}
public class OO {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Gone with the moon";
        one.genre = "Sci-Fi";
        one.rating = 8;
        Movie Two = new Movie();
        Two.title = "Antes do 234";
        Two.genre = "Sci-Fi";
        Two.rating = 7;
        Two.playIt();
        Movie Three = new Movie();
        Three.title = "Gone with";
        Three.genre = "Comedy";
        Three.rating = 6;
        ;
    }
}