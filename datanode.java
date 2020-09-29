
public class datanode {
  private String firstName;
  private String lastName;
  private String team;
  private int jerseyNo;
  private String position;
  private int homeRuns;
  
  public datanode(String fn, String ln, String tm, int jn, String pos, int hrun) {
    this.firstName = fn;
    this.lastName = ln;
    this.team = tm;
    this.jerseyNo = jn;
    this.position = pos;
    this.homeRuns = hrun;
  }
  
  public void setFirstName(String name) {
    this.firstName = name;
  }
  
  public void setLastName(String name) {
    this.lastName = name;
  }
  
  public void setTeamtName(String name) {
    this.team = name;
  }
  
  public void setJerseyNum(int num) {
    this.jerseyNo = num;
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
    return team;
  }
  
  public int getJerseyNum() {
    return jerseyNo;
  }
  
  public String getPosition() {
    return position;
  }
  
  public int getHomeRuns() {
    return homeRuns;
  }
}