//Name : Sreenath Reddy Challuri
//Student Id: A00247493

import java.util.Random;


public class Die
{


        /* Declaration of variables */

        private String name;
        private int number_of_sides;
        private int current_side_up;


        /* Constructor with zero arguments */
       public Die()
       {
           name = "d6";
           number_of_sides = 6;
           System.out.println("creating a default " + name + "....");
           roll();
       }

    /* Constructor with one arguments */
    public Die(int number_of_sides)
    {
        name = "d" + number_of_sides;
        this.number_of_sides = number_of_sides;
        System.out.println("creating a " + name +"....");
        roll();
    }

    /* Constructor with two arguments */
    public Die(String name, int number_of_sides)
    {
        this.name = name + number_of_sides;
        this.number_of_sides = number_of_sides;
        System.out.println("creating percentile die (a special " + this.name + ")....");
        roll();
    }


    /* Roll method which generates random integer value */
       public void roll()
       {
           Random random = new Random();
           int value = random.nextInt(6) + 1;
           setCurrent_side_up(value);
       }


       /* Below methods setters and getter methods which is used to bind the data and to retrieve the data */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber_of_sides() {
        return number_of_sides;
    }


    public int getCurrent_side_up() {
        return current_side_up;
    }

    public void setCurrent_side_up(int current_side_up) {
        this.current_side_up = current_side_up;
    }


}
