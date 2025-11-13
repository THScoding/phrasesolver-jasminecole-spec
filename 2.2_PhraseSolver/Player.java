/*
 * Activity 2.2.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player
{
   Scanner sc = new Scanner(System.in);

  /* your code here - attributes */
  private String name;
  private int points; 

  /* your code here - constructor(s) */ 
  public Player()
  {
    System.out.println("Please type a name.");
    name = sc.nextLine();
    System.out.println("Welcome to the game, " + name);
    points = 0;
  }

  public Player(String inputName)
  {
    System.out.println("Please type a name.");
    name = sc.nextLine();
    System.out.println("Welcome to the game, " + name);
    points = 0;
  }

  /* your code here - accessor(s) */ 

  /* your code here - mutator(s) */ 
}