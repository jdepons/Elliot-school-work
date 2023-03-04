import java.util.Scanner;

public class PokemonStarter {

    public static void main(String[] args) {

        //Scanner scan2 = new Scanner();

        Scanner scan =new Scanner(System.in);

        System.out.println("what is the level?");
        int level = scan.nextInt();


        Pokemon p1 = new Pokemon("Pikachu",level);
       // p1.setName("Pikachu");
        //p1.setLevel(10);

        Pokemon p2 = new Pokemon();
        p2.setName("Eevee");
        p2.setLevel(20);


        p1.attack();
        p2.attack();

    }
}
