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
      // CURRENT GUESSING PLAYER- USE CURRENTPLAYER int
      PhraseSolver p = new PhraseSolver();
      System.out.println(p.getPlayer()); 

      //show partially solved phrase
      Board b = new Board();
      System.out.println(b.getSolvedPhrase());

      //show the point value of the next letter guess
      Player o = new Player();
      System.out.println(o.getPoints());
      
      /* your code here - determine how game ends */
      solved = true; 
    } 
   
  }
  
}