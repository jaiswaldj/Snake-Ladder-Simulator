import java.util.Random;

public class SnakeandladderUC1 {

	    public static void main(String[] args) {
	       // Constants
	       int STARTPOSITION=0;
	       int Player1=STARTPOSITION;

	       Random roll = new Random();
	       int rollDice = roll.nextInt(6)+1;
	       System.out.println(rollDice);
	                // Computation
	       if (rollDice == STARTPOSITION)
	          System.out.println("Single Player is Start with zero");
	       else
	          System.out.println("Single Player is Start with one");
	    }
 }
