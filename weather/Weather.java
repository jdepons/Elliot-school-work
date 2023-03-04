package weather;

public class Weather {

    public Weather(){
    }

    public double rainAmount(double totalRfMonth, double yestHighTemp){

        return (yestHighTemp/10) - totalRfMonth;
    }

    public double snowAmount(double monthNum, double dayNum){

        return dayNum - monthNum;
    }

    public int lowTemperature(int low1, int low2, int low3){

        return (low1 + low2 + low3)/3;
    }

    public double tornadoPercentage(){

        return 0.73;
    }

}
