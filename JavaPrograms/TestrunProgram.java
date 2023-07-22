import java.util.*;
import java.util.Map;

public class TestrunProgram {
  public static void main(String[] args) {
    Map<Character, Integer> m = new HashMap<>();
    String s = "abcdABCDabcd";

    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (m.containsKey(ch)) {
        m.put(ch, m.get(ch) + 1);
      } else {
        m.put(ch, 1);
      }
    }
    System.out.println(m);
  }

}
