import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner; // Import the Scanner class to read text files

public class ImportPlayers {
	public LinkedList<MlbData>[] mlbPlayers;
	private int size;
	
	public ImportPlayers() {
		  
		try {
			mlbPlayers = new LinkedList[100];
			File myObj = new File("MLBStats.txt");
			Scanner myReader = new Scanner(myObj);
			  
			while (myReader.hasNextLine()) { 
				
				addPlayer(myReader);
			 }
			  myReader.close();
			  
		 } catch (FileNotFoundException e) {
			  System.out.println("An error occurred.");
			  e.printStackTrace();
	    } catch(NoSuchElementException e2) {
	    	System.out.println("You are done parsing the file of MLB player statistics!");
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
		int hash = Math.abs(firstName.hashCode()) % 100;
		list.add(new MlbData(firstName, lastName, teamName, num, pos, homeRuns));
		
		mlbPlayers[hash] = list;
		
		size++;
	
	}
	
	public int size() {
		return size;
	}
}