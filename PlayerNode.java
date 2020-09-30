import java.util.ArrayList;
public class PlayerNode<String> {
  String key;
  ArrayList<Object> value;
  
  public PlayerNode(String key, ArrayList<Object> value) {
    this.key = key;
    this.value = value;
  }
}
