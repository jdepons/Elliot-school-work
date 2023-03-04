package GetterSetter;
import java.util.Scanner;
public class RabbitPopulationStarter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        RabbitPopulation rp = new RabbitPopulation();

        System.out.println("What is the Rabbit Population?");
        int rabbit = input.nextInt();
        rp.setPopulation(rabbit);

        System.out.println("The population is " + rp.getPopulation() + "rabbits");

        rp.matingSeason();

        System.out.println("The population after mating season is " + rp.getPopulation());

        rp.HuntingSeason();

        System.out.println("The population after hunting season is " + rp.getPopulation());
    }
}
