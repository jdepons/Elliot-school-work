import java.util.Scanner;
public class CubeStarter{

    public static void main(String[] args) {
        Scanner bobby = new Scanner(System.in);
        Cube bozo = new Cube();
        System.out.println("What is the side length?");
        int sArea = bobby.nextInt();
        int surfaceArea = bozo.bob(sArea);

        System.out.println(surfaceArea);

    }
}
