/*
 * Activity 2.2.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;
  
public class PhraseSolver
{
  /* your code here - attributes */
   private Player player1;
    private Player player2;
    private Board board;
    private boolean solved;


  /* your code here - constructor(s) */ 
  public PhraseSolver()
  {
    player1 = new Player();
    player2 = new Player();
    board = new Board(); //check this
    solved = false;
  }

  public void play()
  {
    boolean solved = false;
    int currentPlayer = 1;

    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      PhraseSolver p = new PhraseSolver();
      System.out.println(p.getPlayer()); //i give up
      
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}