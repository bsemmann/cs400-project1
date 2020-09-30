import java.util.NoSuchElementException;

public interface PlayerData<String> {
  public int getPlayerNumber(String playerName) throws NoSuchElementException;
  public String getPlayerPosition(String playerName) throws NoSuchElementException;
  public String getTeamName(String playerName) throws NoSuchElementException;
  public int getHomeRuns(String playerName) throws NoSuchElementException;
  public boolean containsPlayer(String playerName);
  public String getPlayerName();
}
