import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class MLBPlayers implements PlayerData<String> {
  public HashTableMap playerTable;
  public ArrayList<Object> playerList = new ArrayList<>();
  String playerName = "";
  
  public MLBPlayers() {
    try {
    playerTable = new HashTableMap();
    File file = new File("MLBStats.txt");
    Scanner sc = new Scanner(file);
    
    while(sc.hasNextLine()) {
      String total = sc.nextLine();
      String[] data = total.split(",");
      playerName = data[0].trim();
      
      playerList.add(data[1].trim());
      playerList.add(data[2].trim());
      playerList.add(data[3].trim());
      playerList.add(data[4].trim());
      
      playerTable.put(playerName, playerList);
    }
    } catch(FileNotFoundException e1) {
      System.out.println("File could not be found!");
    }
  }
  
  @Override
  public int getPlayerNumber(String playerName) throws NoSuchElementException {
    int playerNum = 0;
    if(playerTable.containsKey(playerName)) {
      playerNum = (int) playerTable.get(playerName).get(1);
    } else {
      throw new NoSuchElementException("Player's Jersey Number could not be found!!");
    }
    return playerNum;
  }
  
  @Override
  public String getPlayerPosition(String playerName) throws NoSuchElementException {
    String playerPos = "";
    if(playerTable.containsKey(playerName)) {
      playerPos = (String) playerTable.get(playerName).get(2);
    } else {
      throw new NoSuchElementException("Player's Position could not be found!!");
    }
    return playerPos;
  }
  
  @Override
  public String getTeamName(String playerName) throws NoSuchElementException {
  String teamName = "";
  if(playerTable.containsKey(playerName)) {
    teamName = (String) playerTable.get(playerName).get(0);
  } else {
    throw new NoSuchElementException("Player's Team Name could not be found!!");
  }
  return teamName;
  }
  
  @Override
  public int getHomeRuns(String playerName) throws NoSuchElementException {
    int homeRuns = 0;
    if(playerTable.containsKey(playerName)) {
      homeRuns = (int) playerTable.get(playerName).get(3);
    } else {
      throw new NoSuchElementException("Player's home runs could not be found!!");
    }
    return homeRuns;
  }
  
  @Override
  public boolean containsPlayer(String playerName) {
    if(playerTable.containsKey(playerName)) {
      return true;
    }
    return false;
  }
  
  @Override
  public String getPlayerName() {
    return playerName;
  }
}