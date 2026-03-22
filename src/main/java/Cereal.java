/**
 * Cereal.java
 *
 * @Vincent Guo – Your name
 * @8-8:53 – Class period
 *
 */
public class Cereal
{
    private String name;
    private int calories;
    private int fiber;
    private int carbs;
    private double cups;
    public Cereal(name,calories,fiber,carbs,cups){
        
        String this.name = name;
        int this.calories = calories;
        int this.fiber = fiber;
        int this.carbs = carbs;
        double this.cups = cups;

    }
    
    public String getName(){
        return name;
    }
    
    public int getCal(){
        return calories;
    }
    
    public int getFiber(){
        return fiber;
    }
    
    public int getCarbs(){
        return carbs;
    }
    
    public double getCups(){
        return cups;
    }
    
    public String toString(){
        return("Cereal: " + name+ ", contains: "+calories+ " calories per serving, "+fiber+ " grams of fiber"+carbs+" grams of carbs and " + cups + " cups per serving.");
    }
    // private instance variables to hold info about a cereal from the data set
    // the name, calories, fiber, carbohydrates, and cups

    // constructor that creates a cereal object

    // accessor methods for each instance variable

    /* toString method returns the values stored in the instance variables
       concatenated in a sentence starting with "Cereal: " */

}


