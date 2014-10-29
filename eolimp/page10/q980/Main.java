package page10.q980;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(),
        ns[][] = new int[n][n],
        vs[] = new int[n];

    for(int i=0; i<n; i++)
      for(int j=0; j<n; j++)
        ns[i][j] = in.nextInt();

    for(int i=0; i<n; i++)
      vs[i] = in.nextInt();

    int min = Integer.MAX_VALUE, x = -1, y = -1;
    for(int i=0; i<n; i++)
      for(int j=0; j<n; j++)
        if(i != j && vs[i] == 0 && vs[j] == 1 && ns[i][j] < min) {
          min = ns[i][j];
          x = i;
          y = j;
        }

    System.out.println((x+1) + " " + (y+1));
  }
}
