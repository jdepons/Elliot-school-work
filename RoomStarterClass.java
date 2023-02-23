/*
Declare an object variable closet of type Room and assign it a new Room object.
Declare an object variable kitchen of type Room and assign it a new Room object
assign kitchen the value of closet
Declare an object variable basement of type Room and assign
it a new Room object
assign closet the value of basement
have closet run the area method
 */

public class RoomStarterClass {

    public static void main (String[] args) {

Room closet = new Room();
Room kitchen = new Room();
kitchen = closet;
Room basement = new Room();
closet = basement;
closet.AreaWithDoor();


    }

}
