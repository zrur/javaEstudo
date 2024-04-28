package javaNormal;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String world = "bottles";
        while (beerNum>0){

            if (beerNum == 1){
                world = "bottle";//no singular,como em UMA garrafa.
            }
            System.out.println(beerNum + " " +world + "of beer on the wall");
            System.out.println( beerNum +" "+ world + "of beer. ");
            System.out.println("Take one down");
            System.out.println("Pass it around.");
            beerNum = beerNum - 1;

            if (beerNum>0){
                System.out.println(beerNum  + " " + world + "of beer on the wall");
            } else {
                System.out.println("No more bottles  of beer on the wall ");
            }//fim do else
        }//fim do loop while
    }//fim do metodo main
}//fim da classe
