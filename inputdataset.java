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
  
  
  public void addPlayer(Scanner myReader) {
    String firstName = myReader.next();
    
    String lastName = myReader.next();

    String teamName = myReader.next() + " " + myReader.next();
    
    if (!myReader.hasNextInt()) {
      teamName = teamName + " " + myReader.next();
    }

    int num = myReader.nextInt();
    
    String pos = myReader.next();
    
    int homeRuns = myReader.nextInt();
    
    LinkedList list = new LinkedList();
    int hashCode = Math.abs(firstName.hashCode()) % 100;
    list.add(new datanode(firstName, lastName, teamName, num, pos, homeRuns));
    
    baseballPlayers[hashCode] = list;
    
    size++;
    
  
  }
  
  public int size() {
    return size();
  }
}