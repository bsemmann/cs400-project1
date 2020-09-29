import java.io.File; 
import java.io.FileNotFoundException;  
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner; 

public class inputdataset {
  public LinkedList<datanode>[] baseballPlayers;
  private int size;
  
  public inputdataset() {
      
    try {
      baseballPlayers = new LinkedList[100];
      File file = new File("data.txt");
      Scanner data= new Scanner(file);
        
      while (data.hasNextLine()) { 
        
        addPlayer(data);
       }
        data.close();
        
     } catch (FileNotFoundException e) {
        System.out.println("no data present");
       
      } catch(NoSuchElementException e2) {
        System.out.println("no element present");
      }
    }
  
  private int arrayIndex(String key) {
    int hash = Math.abs(key.hashCode());
    hash = hash % 100;

    return hash;
  }
  
  
  public void addData(Scanner myReader) {
    String firstName = data.next();
    
    String lastName = data.next();

    String teamName = data.next() + " " + data.next();
    
    if (!data.hasNextInt()) {
      teamName = teamName + " " + data.next();
    }

    int num = data.nextInt();
    
    String pos = data.next();
    
    int homeRuns = data.nextInt();
    
    LinkedList list = new LinkedList();
    int hashCode = arrayIndex(lastName);
    list.add(new datanode(firstName, lastName, teamName, num, pos, homeRuns));
    
    baseballPlayers[hashCode] = list;
    
    size++;
    
  
  }
  
  public int size() {
    return size();
  }
}
