package page70.q6956;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt(), freq[] = new int[13];

    while(t-- > 0) {
      in.next();
      freq[Integer.parseInt(in.next().split("/")[1])]++;
    }
    for(int i=1; i<freq.length; i++)
      System.out.println(i + " " + freq[i]);
  }
}
