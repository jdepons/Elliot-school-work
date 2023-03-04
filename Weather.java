public class Weather {

    public double rainDrop(double rainMonth, double rainYear) {

        return rainMonth-rainYear;



    }


    public static void main(String[] args) {
        Weather weather = new Weather();

        double ret = weather.rainDrop(5.3,6.5);


    }
}
