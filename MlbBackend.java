import java.util.LinkedList;
import java.util.NoSuchElementException;

//NOTE: This code only works when combined with the Data Wrangler's code!
public class MlbBackend {
  
  public LinkedList<MlbData>[] mlbPlayers;
  
  public MlbBackend() {
    mlbPlayers = new LinkedList[100];
  }
 
  //retrieves the player's jersey number
  public int getPlayerNumber(String firstName, String lastName) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        return linkedList.get(x).getJerseyNum();
      }
    }
    throw new NoSuchElementException("Could not find Jersey Number!");
  }
  
  //changes the player's jersey number
  public void changePlayerNumber(String firstName, String lastName, int num) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        linkedList.get(x).setJerseyNum(num);
        return;
      }
    }
    throw new NoSuchElementException("Could not find Jersey Number!");
  }
  
  //retrieves the player's full name in this style "John Doe"
  public String getPlayerName(String firstName, String lastName) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        String fullName = linkedList.get(x).getFirstName() + " " + linkedList.get(x).getLastName();
        return fullName;
      }
    }
    throw new NoSuchElementException("Could not find Full Name!");
  }
  
  //changes the player's full name
  public void changePlayerName(String firstName, String lastName) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        linkedList.get(x).setFirstName(firstName);
        linkedList.get(x).setLastName(lastName);
        return;
      }
    }
    throw new NoSuchElementException("Could not find Jersey Number!");
  }
  
  //retrieves the player's team name
  public String getTeamName(String firstName, String lastName) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        return linkedList.get(x).getTeamName();
      }
    }
    throw new NoSuchElementException("Could not find Team Name!");
  }
  
  
  //changes the player's team name
  public void changeTeamName(String firstName, String lastName, String team) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        linkedList.get(x).setTeamtName(team);
        return;
      }
    }
    throw new NoSuchElementException("Could not find Jersey Number!");
  }
  
  //retrieves the player's position
  public String getPlayerPos(String firstName, String lastName) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        return linkedList.get(x).getPosition();
      }
    }
    throw new NoSuchElementException("Could not find Player position!");
  }
  
  //changes the player's position
  public void changePlayerPos(String firstName, String lastName, String pos) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        linkedList.get(x).setPosition(pos);
        return;
      }
    }
    throw new NoSuchElementException("Could not find Jersey Number!");
  }
  
  //retrieves the player's home runs
  public int getPlayerRun(String firstName, String lastName) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        return linkedList.get(x).getHomeRuns();
      }
    }
    throw new NoSuchElementException("Could not find Home Runs!");
  }
  
  //changes the player's home runs
  public void changePlayerRun(String firstName, String lastName, int runs) {
    int index = Math.abs(firstName.hashCode()) % 100;
    LinkedList<MlbData> linkedList = mlbPlayers[index];
    if (linkedList == null) {
      throw new NoSuchElementException("Player does not exist!");
    }
    for (int x = 0; x < linkedList.size(); x++) {
      if (linkedList.get(x).getFirstName().equals(firstName) && linkedList.get(x).getLastName().equals(lastName)) {
        linkedList.get(x).setHomeRuns(runs);
        return;
      }
    }
    throw new NoSuchElementException("Could not find Jersey Number!");
  }

}
