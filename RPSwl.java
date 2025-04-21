import java.util.*;
public class RPSwl {
  public static void main(String[] args) {      
    Scanner sc = new Scanner(System.in);
    String[] rps = {"r", "p", "s"};
    int idx = 0; 
    int wins = 0;
    int losses = 0;
    int ties = 0;
    while (true) {
      String computerMove = rps[idx];
      if (idx == 2) {
        idx = 0;
      }
      else {
        idx++;
      }
      String playerMove;
      while (true) {
        System.out.println("Please enter your move (r for Rock, p for Paper, s for Scissors):");
        playerMove = sc.nextLine().toLowerCase();
        if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
          break;
        }
        System.out.println(playerMove + " is not a valid move.");
      }
      System.out.println("Computer played: " + computerMove);
      if (playerMove.equals(computerMove)) {
        System.out.println("The game was a tie!");
        ties++;
      }
      else if (playerMove.equals("r")) {
        if (computerMove.equals("p")) {
          System.out.println("You lose!");
          losses++;
        }
        else {
          System.out.println("You win!");
          wins++;
        }
      }
      else if (playerMove.equals("p")) {
        if (computerMove.equals("s")) {
          System.out.println("You lose!");
          losses++;
        }
        else {
          System.out.println("You win!");
          wins++;
        }
      }
      else if (playerMove.equals("s")) {
        if (computerMove.equals("r")) {
          System.out.println("You lose!");
          losses++;
        }
        else {
          System.out.println("You win!");
          wins++;
        }
      }
      System.out.println("Current Score => Wins: " + wins + ", Ties: " + ties + ", Losses: " + losses);
      System.out.println("Play Again? (Y/N)");
      String playAgain = sc.nextLine();
      if (playAgain.equalsIgnoreCase("n")) {
        break;
      }
    }
    System.out.println("Final Score => Wins: " + wins + ", Ties: " + ties + ", Losses: " + losses);
    sc.close();
  }
}
