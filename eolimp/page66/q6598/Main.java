package page66.q6598;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.hasNextInt())
      System.out.println(count(in.nextInt(), in.nextInt()));
  }

  private static int count(int a, int b) {
    int cnt = 0;
    while(a <= b) {
      if(isDifferent(a)) cnt++;
      a++;
    }
    return cnt;
  }

  private static boolean isDifferent(int n) {
    HashSet<Character> s = new HashSet<Character>();
    for(char c : String.valueOf(n).toCharArray()) {
      if(s.contains(c)) return false;
      else s.add(c);
    }
    return true;
  }
}
