package page9.q843;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

  private static HashSet<String> ss = new HashSet<String>();

  public static void main(String[] args) {
    perm("", new Scanner(System.in).next());
    for(String s : ss)
      System.out.println(s);
  }

  private static void perm(String prefix, String s) {
    int n = s.length();
    if(n == 0) ss.add(prefix);
    else {
      for(int i=0, l=s.length(); i<l; i++) {
        perm(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1));
      }
    }
  }
}
