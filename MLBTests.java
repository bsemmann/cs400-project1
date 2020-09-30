// --== CS400 File Header Information ==--
// Name: Adam Tupitza
// Email: tupitza@wisc.edu
// Team: FF
// Role: Test Engineer 1
// TA: Abhay Kumar
// Lecturer: Gary Dahl
// Notes to Grader:
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * This class contains a variety of tests checking for correct functionality of the MLB Home Run
 * Database, and a main method used to run the tests and show their results.
 * 
 * @author Adam Tupitza
 *
 */
public class MLBTests {
  
  public static boolean testAddPlayer() {
    Scanner testScanner = new Scanner("Barry Bonds San Francisco Giants 25 LF 762");
    
    MlbBackend testInstance = new MlbBackend();
    testInstance.addPlayer(testScanner);
    
    if (!testInstance.containsPlayer("Barry Bonds")) {
      return false;
    }
    
    if (!testInstance.getPlayerRun("Barry Bonds").equals("762")) {
      return false;
    }
    
    
    return true;
  }
  
  /**
   * Tests for correct data retrieval of a player existing in the hash table.
   * 
   * @return true if the test passed, false otherwise
   */
  public static boolean testWithValidInput() {
    MlbBackend testInstance = new MlbBackend();
    if (!testInstance.getPlayerPos("Jose Ramirez").equals("3B")) {
      return false;
    }
    
    return true;
  }
  
  /**
   * Tests for correct thrown exception when attempting to retrieve data of a player not in
   * the hash table.
   * 
   * @return true if the test passed, false otherwise
   */
  public static boolean testWithInvalidInput() {
    MlbBackend testInstance = new MlbBackend();
    try {
    testInstance.getTeamName("Fake Player");
    } catch (NoSuchElementException nsee) {
      return true;
    } catch (Exception e) {
      return false;
    }
    
    return false;
  }
  
  /**
   * Check for correctness of size function.
   * 
   * @return true if the test passed, false otherwise
   */
  public static boolean testSize() {
    MlbBackend testInstance = new MlbBackend();
    if (testInstance.size() != 50) {
      return false;
    }
    return true;
  }
  
  /**
   * Check for correct result from contains player on a player in the database.
   * 
   * @return true if the test passed, false otherwise
   */
  public static boolean testContainsPlayerTrue() {
    MlbBackend testInstance = new MlbBackend();
    if (!testInstance.containsPlayer("Kyle Lewis")) {
      return false;
    }
    
    return true;   
  }
  
  /**
   * Check for correct result from contains player on a player not in the database.
   * 
   * @return true if the test passed, false otherwise
   */
  public static boolean testContainsPlayerFalse() {
    MlbBackend testInstance = new MlbBackend();
    if (testInstance.containsPlayer("Kyle Faker")) {
      return false;
    }
    
    return true;   
  }
  
  /**
   * Main method that runs all the test methods in the class and displays the results.
   * 
   * @param args not used by this program
   */
  public static void main(String[] args) {
    System.out.println("testAddPlayer(): " + testAddPlayer());
    System.out.println("testWithValidInput(): " + testWithValidInput());
    System.out.println("testWithInvalidInput(): " + testWithInvalidInput());
    System.out.println("testSize(): " + testSize());
    System.out.println("testContainsPlayerTrue(): " + testContainsPlayerTrue());
    System.out.println("testContainsPlayerFalse(): " + testContainsPlayerFalse());
  }
}
