package weather;
import java.util.Scanner;
public class WeatherStarter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Weather we = new Weather();

        System.out.println("What was the total rainfall this month?");
        double trm = input.nextDouble();
        System.out.println("What was yesterday's high temperature?");
        double ht = input.nextDouble();
        System.out.println(we.rainAmount(trm, ht));


        System.out.println("What is the current month number?");
        double mn = input.nextDouble();
        System.out.println("What is the current day number?");
        double dn = input.nextDouble();
        System.out.println(we.snowAmount(mn, dn));


            System.out.println("What was the lowest temperature the previous year?");
        int lt1 = input.nextInt();
        System.out.println("What was the 2nd lowest temperature the previous year?");
        int lt2 = input.nextInt();
        System.out.println("What was the 3rd lowest temperature the previous year?");
        int lt3 = input.nextInt();
        System.out.println(we.lowTemperature(lt1, lt2, lt3));

        System.out.println(we.tornadoPercentage());
    }



}
