package page14.q1354;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), c = 0;
    HashSet<Long> s = new HashSet<Long>();
    s.add(0L);
    long j = 1;
    for(int i=0; i<32; i++) {
      j <<= 1;
      s.add(j);
    }

    while(n-- > 0)
      if(s.contains(in.nextLong()+1)) c++;
    System.out.println(c);
  }
}
