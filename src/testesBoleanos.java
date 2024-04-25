public class testesBoleanos {
    public static void main(String[] args) {
        System.out.println("<(menor que)");
        System.out.println(">(maior que)");
        System.out.println("==(igualdade)");

        int x = 4;
        while (x>3){
            //o codigo do loop será executado porque
            // x é maior que 3
            x = x -1;//ficaria assim infinitamente
        }
        int z = 27;//
        while (z==3){
            // o codigo não será executado porque
            //z não é igual a 3
        }
    }
}
