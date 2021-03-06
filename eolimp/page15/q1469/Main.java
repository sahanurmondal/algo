package page15.q1469;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger fibs[] = new BigInteger[1001];
    fibs[0] = BigInteger.ZERO;
    fibs[1] = BigInteger.ONE;
    for(int i=2; i<fibs.length; i++) {
      fibs[i] = fibs[i-1].add(fibs[i-2]);
    }

    while(in.hasNextInt()) {
      System.out.println(fibs[in.nextInt()].toString());
    }
  }
}
