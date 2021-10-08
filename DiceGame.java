//Name : Sreenath Reddy Challuri
//Student Id: A00247493
public class DiceGame
{
    public static void main(String[] args)
    {

        /* Creating three different objects of same class and passing values to the contructor parameters */
        Die die = new Die();
        Die die1 = new Die(20);
        Die die2 = new Die("d", 10);


        /* Getting values from the Getters and setters class and passing to the print statements */

        System.out.println("The current side up for " + die.getName() + " is " + die.getCurrent_side_up());
        System.out.println("The current side up for " + die1.getName() + " is " + die1.getCurrent_side_up());
        System.out.println("The current side up for percentile " + die2.getName() + " is " + die2.getCurrent_side_up());

        System.out.println("\n");

        System.out.println("Testing the roll method");
        System.out.println("\n");
        System.out.println("Rolling the " + die.getName() + "....");
        die.roll();
        int current_side_up = die.getCurrent_side_up();
        System.out.println("The new value is " + current_side_up + "....");

        System.out.println("Rolling the " + die1.getName() + "....");
        die1.roll();
        int current_side_up1 = die1.getCurrent_side_up();
        System.out.println("The new value is " + current_side_up1 + "....");

        System.out.println("Rolling the percentile....");
        die2.roll();
        int current_side_up2 = die2.getCurrent_side_up();
        System.out.println("The new value is " + current_side_up2 + "....");


        System.out.println("\n");
        System.out.println("Setting the " + die1.getName() + " to show " + die1.getNumber_of_sides());
        System.out.println("The side up is now " + die1.getNumber_of_sides() + ". Finally.");

    }
}
