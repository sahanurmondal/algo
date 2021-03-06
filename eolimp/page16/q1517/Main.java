package page16.q1517;

import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigInteger;

public class Main {

  static BigInteger mod = new BigInteger("10");
  static BigInteger zero = new BigInteger("0");
  static BigInteger one = new BigInteger("1");
  static BigInteger two = new BigInteger("2");
  static BigInteger fortyFive = new BigInteger("45");

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    ArrayList<BigInteger> results = new ArrayList<BigInteger>();

    int low = in.nextInt();
    int high = in.nextInt();

    while(low >= 0 && high >= 0) {
      results.add(s(low, high));
      low = in.nextInt();
      high = in.nextInt();
    }

    for(BigInteger i : results) System.out.println(i);
  }

  private static BigInteger s(int low, int high) {
    return f(new BigInteger(String.valueOf(high)))
        .subtract(f(new BigInteger(String.valueOf(low-1))));
  }


  private static BigInteger f(BigInteger n) {
    if(n.compareTo(zero) != 1) return new BigInteger("0");
    return  f(n.divide(mod)).add(
        (n.mod(mod).multiply(n.mod(mod).add(one)).divide(two).add(n.divide(mod).multiply(fortyFive))));
  }

}