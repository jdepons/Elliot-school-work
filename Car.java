/*Include the following methods:
        sayOdometer – outputs the number of miles on the car
        sayFlat - output a message indicating that it has a flat tire
        sayThirsty - output a message indicating that it is out of gas

        Create a Starter class, a class with a main method that thoroughly tests the Car class.

*/

import java.util.Scanner;

public class Car {


        public void sayOdometer() {
            Scanner input = new Scanner(System.in);
        int miles = 1;
            System.out.println("How many miles are on your car?");
            miles = input.nextInt();
            System.out.println("There are " + miles + " miles on your car");
        }
        public void sayFlat () {
            System.out.println("You have a flat tire");
        }
        public void sayThirsty () {
            System.out.println("You are out of gas by the way");
        }

}