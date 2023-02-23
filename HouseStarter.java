import java.util.Scanner;

public class HouseStarter {

    public static void main(String[] args) {
        //main method in the Test Class
        Scanner input = new Scanner(System.in);
        House myHouse = new House();
        System.out.println("What is the length of the room?");
        double lengthw = input.nextDouble();
        System.out.println("What is the height of the room?");
        double heightw = input.nextDouble();
        myHouse.paintWall(lengthw, heightw);

        System.out.println("How many rows are in your garden?");
        double numrows = input.nextDouble();

        System.out.println("What is the length of your garden?");
        double lengthg = input.nextDouble();
        myHouse.plantGarden(lengthg, numrows);

        System.out.println("What is the radius of your pool?");
        double radius = input.nextDouble();
        System.out.println("What is the height of your pool?");
        double heightp = input.nextDouble();
        myHouse.fillPool(radius, heightp);

    }
}
