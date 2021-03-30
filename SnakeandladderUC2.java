import java.util.*;
public class SnakeandladderUC2 {
    public static void main(String args[])
    {
        int startPosition=0;
        int player1=startPosition;

        Random roll = new Random();
        int rollDice= roll.nextInt(6)+1;
        System.out.println(rollDice);

    }
}

