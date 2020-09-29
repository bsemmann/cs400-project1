import java.util.Scanner;
import java.util.NoSuchElementException;
public class MLBDriver extends ImportPlayers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice = 0;
    ImportPlayers importPlayers = new ImportPlayers();
    MlbBackend player = new MlbBackend();
    System.out.println("****    WELCOME TO THE MLB HOMERUN DATABASE!!!                        ****");
    System.out.println("");
    System.out.println("");
    System.out.println("****    Enter the player's name whose MLB Stats you want to check!    ****");
    System.out.println("****    Enter in the following format: (first name) (last name)       ****");
    String str = sc.nextLine();
    if(str.contains(" ")) {
      String firstName = "";
      String lastName = "";
      String[] playerName = str.trim().split("\\s+");
      firstName = playerName[0];
      lastName = playerName[1];
      do {
      System.out.println("****    CHOOSE FROM THE OPTIONS BELOW:                                ****");
      System.out.println("****    1.) "+str+"'s Team                                     ****");
      System.out.println("****    2.) "+str+"'s Jersey Number                            ****");
      System.out.println("****    3.) "+str+"'s Position                                 ****");
      System.out.println("****    4.) "+str+"'s Home Runs                                ****");
      System.out.println("****    5.) Exit                                                      ****");        
      choice = sc.nextInt();
      switch (choice) {
        case 1:
          String team = "";
          try {
          team = player.getTeamName(firstName, lastName);
          } catch (NoSuchElementException e) {
            System.out.println("Player's Team Name could not be found");
            break;
          }
          System.out.println(str+"'s Team Name: "+team);
          break;
        case 2:
          int num = 0;
          try {
          num = player.getPlayerNumber(firstName, lastName);
          } catch (NoSuchElementException e) {
            System.out.println("Player's Jersey Number could not be found!");
            break;
          }
          System.out.println(str+"'s Jersey Number: "+num);
          break;
        case 3:
          String pos = "";
          try {
          pos = player.getPlayerPos(firstName, lastName);
          } catch (NoSuchElementException e) {
            System.out.println("Player's Position could not be fonud!");
            break;
          }
          System.out.println(str+"'s Team Name: "+pos);
          break;
        case 4:
          int runs = 0;
          try {
          runs = player.getPlayerRun(firstName, lastName);
          } catch (NoSuchElementException e) {
            System.out.println("Player's Home Runs could not be found!");
            break;
          }
          System.out.println(str+"'s Home Runs: "+runs);
          break;
        case 5:
          System.out.println("****    THANK YOU FOR USING OUR MLB DATABASE!!!!                      ****");
          sc.close();
          return;
        default:
          System.out.println("Sorry! Invalid option entered! Please Try Again.");
          break;
      }
     } while (choice != 5);
    } else {
      System.out.println("Wrong Name Format! Please try again!");
    }
    sc.close();    
  }
}