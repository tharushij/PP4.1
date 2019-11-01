import java.util.Scanner;
import java.util.Random;

public class rollDie
{
    //initialize variables
    int numSides; //side #
    int lands; //what # it lands on

    //setting up die, default constructor
    public void Die()
    {
        numSides = 0;
        lands = 0;
    } //end default constructor
    //set up double/multi arg constructor
    public void Die(int newNumSides, int newLands)
    {
        numSides = newNumSides;
        lands = newLands;
    } //end multi-arg constructor
    //returns landed face as string
    public String roll()
    {
        //a) create scanner b) ask for numsides
        //c) create random num d) set limit to numSides
        //e) create output stmnt + return output

        //a
        Scanner keyboard = new Scanner(System.in);
        //b
        System.out.println("How many sides will your die have?");
        numSides = keyboard.nextInt();
        //c
        Random ranNum = new Random();
        //d
        lands = ranNum.nextInt(numSides);
        //e
        String output;
        output = "It landed on: " + lands;
        return output;
    } //end method roll


} //end class rollDie
