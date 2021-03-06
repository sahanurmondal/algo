package page26.q2541;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    TreeMap<Integer, ArrayList<String>> t = new TreeMap<Integer, ArrayList<String>>();

    while(in.hasNextLine()) {
      String s = in.nextLine();
      int k = getScore(s);
      if(!t.containsKey(k))
        t.put(k, new ArrayList<String>());
      t.get(k).add(s);
    }

    for(int k : t.descendingKeySet()) {
      Collections.sort(t.get(k));
      for(String s : t.get(k))
        System.out.println(s);
    }
  }

  private static int getScore(String s) {
    int sum = 0;
    String used = "";
    for(int i=0, l=s.length(); i<l; i++) {
      char c = s.charAt(i);
      sum += c - 'a' + 1;
      if(i > 0 && c == s.charAt(i-1) && used.indexOf(c) < 0) {
        used += c;
        sum += 2 * (c - 'a' + 1);
      }
    }
    return sum;
  }
}
