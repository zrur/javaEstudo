package javaOrientadoaObjetos;

public class OO {
    public static void main(String[] args) {//um metodo main

        Movie one = new Movie();//cria um objeto filme
        one.title = "Gone with the moon";//cria tituo
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