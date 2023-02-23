
/*
Write a program that computes the amount of money it will cost to cut a lawn.

Prompt the user for the length and width of the lawn in feet.
 (It is assumed that the lawn is a rectangle.)
 Prompt the user for the width of the mower deck in inches.
  (This is how wide each pass of the mower will cut.)
  Prompt the user for the speed of the mower in miles per hour.
  The current rate of pay for cutting grass is $12/hour. (Store this value as a constant.)

  Display the length of time it will take to cut the lawn and the amount of money it will cost.

 */

import java.util.Scanner;

public class JDCut {

public static void main(String[] args) {
    final int ratePerHour = 12;

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Length in feet");
    double length = scan.nextDouble();
    System.out.println("Enter Width in feet");
    double width = scan.nextDouble();
    System.out.println("Enter mower deck width in inches");
    double mowerWidth = scan.nextDouble();
    double mowerWidthFeet = mowerWidth /12;
    System.out.println("Enter mower speed (mph)");
    double mowerSpeedMPH = scan.nextDouble();
    double mowerSpeedFPH = mowerSpeedMPH * 5280;

    double areaOfLawn = length * width;  // square feet





}

}
