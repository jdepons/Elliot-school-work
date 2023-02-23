/*House class:  The water source available to fill the pool pumps at a rate of 300 gallons per hour.
Display the number of hours required to fill the pool with water.
Main Method:  The pool’s shape is a cylinder.  Prompt the user for the radius and height of the pool.
Pass the radius and height to the method.
*/
public class House {

    public void paintWall(double length, double height){
        double time = 1.0;
        final double RATE = 1 / 200.0;   //200 sq ft per hour
        final double CONVERSION = 60.0/1;    //minutes per hour
        time = (length * height) * RATE * CONVERSION;
        System.out.println("It will take " + time + "minutes to paint the wall.");
    }
    public void plantGarden(double lengthg, double numrows){
        double totalLinearFeet = (lengthg * numrows)/15;
        double totalTime = 2*totalLinearFeet;

        System.out.println("it will take " + totalTime + " hours");
    }
    public void fillPool(double radius, double heightp){
        double areaC = Math.PI * (radius * radius);
        double volumeP = areaC * heightp;
        double gallons = volumeP/0.1337;
        double hours = gallons/300;
        System.out.println("It will take " + hours + " hours to fill up the pool");
    }
}
