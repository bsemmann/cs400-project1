import java.util.Scanner;
import java.util.NoSuchElementException;

public class MLBDriver extends MLBPlayers {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String choice = "";
    MLBPlayers player = new MLBPlayers();
    System.out
        .println("****    WELCOME TO THE MLB HOMERUN DATABASE!!!                        ****");
    System.out.println("");
    System.out.println("");
    System.out
        .println("****    Enter the player's name whose MLB Stats you want to check!    ****");
    System.out
        .println("****    Enter in the following format: (first name) (last name)       ****");
    String name = sc.nextLine().trim();

    boolean val = true;
    while (val) {
      try {
        if (!player.getPlayerName().equalsIgnoreCase(name)) {
          val = false;
        } else {
          System.out.println("Player does not exist, please try again! (Or 'q' to exit)");
          String s = sc.nextLine();
          if (s.equalsIgnoreCase("q"))
            return;
          val = true;
        }
      } catch (NoSuchElementException e) {
        System.out.println("Player not found");
        return;
      }
    }


    do {
      System.out
          .println("****    CHOOSE FROM THE OPTIONS BELOW:                                ****");
      System.out
          .println("****    1.) " + name + "'s Team                                     ****");
      System.out
          .println("****    2.) " + name + "'s Jersey Number                            ****");
      System.out
          .println("****    3.) " + name + "'s Position                                 ****");
      System.out
          .println("****    4.) " + name + "'s Home Runs                                ****");
      System.out
          .println("****    5.) Exit                                                      ****");
      choice = sc.next();
      if (choice != null) {
        switch (choice) {
          case "1":
            String team = "";
            try {
              team = player.getTeamName(name);
            } catch (NoSuchElementException e) {
              System.out.println("Player's Team Name could not be found");
              break;
            }
            System.out.println(name + "'s Team Name: " + team);
            break;
          case "2":
            String num = "0";
            try {
              num = player.getPlayerNumber(name);
            } catch (NoSuchElementException e) {
              System.out.println("Player's Jersey Number could not be found!");
              break;
            }
            System.out.println(name + "'s Jersey Number: " + num);
            break;
          case "3":
            String pos = "";
            try {
              pos = player.getPlayerPosition(name);
            } catch (NoSuchElementException e) {
              System.out.println("Player's Position could not be fonud!");
              break;
            }
            System.out.println(name + "'s Team Name: " + pos);
            break;
          case "4":
            String runs = "0";
            try {
              runs = player.getHomeRuns(name);
            } catch (NoSuchElementException e) {
              System.out.println("Player's Home Runs could not be found!");
              break;
            }
            System.out.println(name + "'s Home Runs: " + runs);
            break;
          case "5":
            System.out.println(
                "****    THANK YOU FOR USING OUR MLB DATABASE!!!!                      ****");
            sc.close();
            return;
          default:
            System.out.println("Sorry! Invalid option entered! Please Try Again.");
            break;
        }
      } else {
        System.out.println("Wrong Choice! Please try again!");
      }

    } while (choice != "5");


  }
}
