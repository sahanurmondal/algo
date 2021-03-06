package page59.q5897;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

  private static BigInteger mod = new BigInteger("1000000009"),
                            two = new BigInteger("2"),
                            six = new BigInteger("6");

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long a = in.nextLong(), b = in.nextLong(),
         m = Math.min(a, b), n = Math.max(a, b);

    if (n < 0) {
      System.out.println(getSum(-m).subtract(getSum(-n - 1)).mod(mod).intValue());
    } else if (n == 0) {
      System.out.println(getSum(-m).mod(mod).intValue());
    } else if (m > 0) {
      System.out.println(getSum(n).subtract(getSum(m - 1)).mod(mod).intValue());
    } else if (m == 0) {
      System.out.println(getSum(n).mod(mod).intValue());
    } else {
      System.out.println(getSum(-m).add(getSum(n)).mod(mod).intValue());
    }
  }

  private static BigInteger getSum(long n) {
    BigInteger b = new BigInteger(String.valueOf(n));
    return b.multiply(b.add(BigInteger.ONE))
        .multiply(b.multiply(two).add(BigInteger.ONE))
        .divide(six);
  }
}
