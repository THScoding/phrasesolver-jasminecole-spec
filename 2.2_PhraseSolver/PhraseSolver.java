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
    board = new Board(); 
    solved = false;
    String letter = "";
  }

  public void play()
  {
    boolean solved = false;
    int currentPlayerNum = 1;
    Player currentPlayer = player1;
    Scanner input = new Scanner(System.in);
    
    boolean correct = true;
    while (!solved) 
    {
      
      /* your code here - game logic */
      
      //not two, make it so it switches each time
      
      
        System.out.println(currentPlayer.getPlayer()); 
        System.out.println(board.getSolvedPhrase());
        System.out.println(board.getCurrentLetterValue());
        letter = input.nextLine();
        if(letter == board.getLetter()){
        System.out.println(board.getSolvedPhrase());
        }
        else{
        System.out.println(board.getSolvedPhrase());
        }
        
        //make substring check for if letter matches with any in code thing
        currentPlayer = player2;
      
      
      


      //show partially solved phrase
      //System.out.println(board.getSolvedPhrase());

      //show the point value of the next letter guess
      //System.out.println(board.getCurrentLetterValue()); //??????? lowkey fixing this on Monday
      
      /* your code here - determine how game ends */
      solved = true; 

      //ASwitch player

    } 
   
  }
  
}