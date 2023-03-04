package conditionals;

import java.util.Scanner;
/*
Grade Percentage
        Write a program that calculates and displays a students current grade(as a percent).
        Prompt the user for three test scores and the answer to the question "Did you do the extra credit?".
        If the user did extra credit, they should be prompted for the number of points they earned for extra
        credit.  Add the extra credit points to the average of the test scores.
        Display the average to the screen.
*/

public class GradePercentage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What did you get on your first test? (as a percentage)");
        double test1 = input.nextDouble();
        System.out.println("What did you get on your second test? (as a percentage)");
        double test2 = input.nextDouble();
        System.out.println("What did you get on your third test? (as a percentage)");
        double test3 = input.nextDouble();
        double average = (test1 + test2 + test3)/3;
        System.out.println("Did you do the extra credit? (1 for yes, 0 for no)");
        int extracredit = input.nextInt();

        if (extracredit == 1){
            System.out.println("How many points do you get for doing the extra credit ");
            double ecpoints = input.nextDouble();
            average = average + ecpoints;
        }
        System.out.println("Your grade is " + average + "percent");
    }
}
