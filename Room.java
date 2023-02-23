import java.util.Scanner;

public class Room {

    private Scanner input;

    int age=55;


    public Room() {
        input = new Scanner(System.in);
    }


    public Scanner sayArea(int someValue, boolean abool) {
        System.out.println("my value is " + someValue + abool);
return input;

    }


    public void sayArea() {
        double l = 1.0;
        double w = 1.0;
        System.out.println("What is the length?");
        l = input.nextDouble();
        System.out.println("What is the width?");
        w = input.nextDouble();
        double area = l*w;
        System.out.println("The area of the wall is " + area);}
    public void AreaWithDoor() {
        double ldoor = 1.0;
        double hdoor = 1.0;
        double lroom = 1.0;
        double hroom = 1.0;
        System.out.println("What is the lenght of the room?");
        lroom = input.nextDouble();
        System.out.println("What is the height of the room?");
        hroom = input.nextDouble();
        System.out.println("What is the length of the door?");
        ldoor = input.nextDouble();
        System.out.println("What is the height of the door?");
        hdoor = input.nextDouble();
        double areaofwall = lroom * hroom;
        double areaofdoor = ldoor*hdoor;
        double neededarea = (areaofwall - areaofdoor);
        System.out.println("The area of the wall is " + neededarea);

    }

}
