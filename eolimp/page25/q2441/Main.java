package page25.q2441;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] buf = new int[10001];
    int t = in.nextInt();

    while(t-- > 0) {
      int p = in.nextInt(), n = in.nextInt(), sum = 0;
      for(int i=0; i<n; i++) {
        buf[i] = in.nextInt();
        sum += buf[i];
      }
      System.out.println(p + " " + getMinSum(buf, getDividends(sum), n));
    }
  }

  private static List<Integer> getDividends(int sum) {
    ArrayList<Integer> ps = new ArrayList<Integer>();
    ps.add(1);
    for(int i=2; i<=sum/2; i++) if(sum%i == 0) ps.add(i);
    ps.add(sum);
    return ps;
  }

  private static int getMinSum(int[] buf, List<Integer> ps, int n) {
    for(int p : ps) {
      int sum = 0;
      for(int i=0; i<n; i++) {
        sum += buf[i];
        if(sum == p && i == n-1) return p;
        else if(sum == p) sum = 0;
        else if(sum > p) break;
      }
    }
    return ps.get(ps.size()-1);
  }
}
