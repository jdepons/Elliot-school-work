import java.util.Scanner;
public class GreeterStarter {

    public static void main (String[] args){
        //Scanner input = new Scanner(System.in);
        //System.out.println("What is your name?");
        //String hello = input.nextLine();

        Greeters oc = new Greeters();
        String name = oc.greeting("frank");



        String name2 = oc.asd("hello",6);
        System.out.println(name);

        System.out.println(name2);


    }
}
