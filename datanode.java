
public class datanode {
  private String firstName;
  private String lastName;
  private String teamName;
  private int jerseyNum;
  private String position;
  private int homeRuns;
  
  public datanode(String fn, String lastName, String tn, int jn, String p, int hr) {
    this.firstName = fn;
    this.lastName = lastName;
    this.teamName = tn;
    this.jerseyNum = jn;
    this.position = p;
    this.homeRuns = hr;
  }
  
  public void setFirstName(String name) {
    this.firstName = name;
  }
  
  public void setLastName(String name) {
    this.lastName = name;
  }
  
  public void setTeamtName(String name) {
    this.teamName = name;
  }
  
  public void setJerseyNum(int num) {
    this.jerseyNum = num;
  }
  
  public void setPosition(String pos) {
    this.position = pos;
  }
  
  public void setHomeRuns(int hr) {
    this.homeRuns = hr;
  }
  
  
  public String getFirstName() {
    return firstName;
  }
  
  public String getLastName() {
    return lastName;
  }
  
  public String getTeamName() {
    return teamName;
  }
  
  public int getJerseyNum() {
    return jerseyNum;
  }
  
  public String getPosition() {
    return position;
  }
  
  public int getHomeRuns() {
    return homeRuns;
  }
}