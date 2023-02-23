import java.util.Scanner;
public class ChangeMaker {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        double dollar = 1.00;
        double quarter = 0.25;
        double dime = 0.10;
        double nickel = 0.05;
        double penny = 0.01;
        double value = 1.0;
        System.out.println("How much money do you have? (In decimal form)");
        value = input.nextDouble();

        int afdollar = (int) Math.floor(value/dollar);
        System.out.println("Number of Dollars = " + afdollar);

        double remainder = value % dollar;
        remainder = Math.round(remainder * 100.0) / 100.0;
        int afquarter = (int) Math.floor(remainder/quarter);
        System.out.println("Number of Quarters = " + afquarter);
        double moneyleft = value - afdollar;

        remainder = moneyleft % quarter;
        remainder = Math.round(remainder * 100.0) / 100.0;
        int afdime = (int) Math.floor(remainder/dime);
        System.out.println("Number of Dimes = " + afdime);
        moneyleft = value - afdollar - (afquarter*quarter);

        remainder = moneyleft % dime;
        remainder = Math.round(remainder * 100.0) / 100.0;
        int afnickel = (int) Math.floor(remainder/nickel);
        System.out.println("Number of Nickels = " + afnickel);
        moneyleft = value - afdollar - (afquarter*quarter) - (afdime*dime);

        remainder = moneyleft % nickel;
        remainder = Math.round(remainder * 100.0) / 100.0;
        int afpenny = (int) Math.floor(remainder/penny);
        System.out.println("Number of Pennies = " + afpenny);
        moneyleft = value - afdollar - (afquarter*quarter) - (afdime*dime) - (afpenny*penny);

    }

}
