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
        
        String totalData = data.nextLine();
        
        String[] inputdata = totalData.split(",");
        
        String firstName = inputdata[0].trim();
        
        String lastName = inputdata[1].trim();
        
       String teamName = inputdata[2].trim();
        
        if (!data.hasNextInt()) {
          teamName = teamName + " " + data.next();
        }

        int num = Integer.parseInt(inputdata[3].trim());
        
        String pos = inputdata[4].trim();
        
        int homeRuns = Integer.parseInt(inputdata[5].trim());
        
        LinkedList list = new LinkedList();
        int hashCode = arrayIndex(lastName);
        list.add(new datanode(firstName, lastName, teamName, num, pos, homeRuns));
        
        baseballPlayers[hashCode] = list;
        
        size++;
       }
        data.close();
        
     } catch (FileNotFoundException e) {
        System.out.println("no data present");
       
      } catch(NoSuchElementException e2) {
        System.out.println("no element present");
      }
    }
  
  private int arrayIndex(String key) {
    int hashCode = Math.abs(key.hashCode());
    hashCode = hashCode % 100;

    return hashCode;
  }
  
  public int size() {
    return size();
  }
}