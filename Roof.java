/*The class definition should include:
        a default constructor
        a method that calculates the cost of installing a concrete driveway
        The method is passed the length, width, and thickness of the driveway in feet.
        A concrete driveway costs $100 per cubic yard of concrete to install.
        The method returns the cost for installing the concrete driveway.
        a method that calculates the number of roof shingles it takes to cover a secion of a roof
        The shape of the roof to be covered is a rectangle.
        The method is passed the length and width of the roof in feet.
        A roof shingle covers 1.5 square feet.
        The method returns the number of roof shingles needed to cover the section of roof.
*/

public class Roof {

    public int hey=8;

    //this is the constructor
    public Roof(){
    }

    public int drivewayDi(int l,  int w,  int t){
        int drivedi = l * w * t;
        return drivedi;
    }

    public int calcRoofShingles(int l, int w){
        int roofarea = l * w;
        int number = 5;
        return number;


    }


}
