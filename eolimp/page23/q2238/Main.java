package page23.q2238;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), ns[] = new int[n];
    double avg = 0;

    while(--n > -1) {
      ns[n] = in.nextInt();
      avg += ns[n];
    }

    Arrays.sort(ns);
    avg /= ns.length;
    int i = 0;
    while(i < ns.length && ns[i] <= avg) i++;
    System.out.println(ns.length - i);
  }
}
