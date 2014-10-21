package page40.q3915;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String s = in.nextLine(),
           p = in.nextLine(),
           is = in.nextLine();
    char c = in.nextLine().charAt(0);

    HashSet<Character> sets = new HashSet<Character>();
    HashSet<Integer> seti = new HashSet<Integer>();
    for(String e : p.split("\\s"))
      sets.add(e.charAt(0));
    if(!is.isEmpty())
      for(String e : is.split("\\s"))
        seti.add(Integer.parseInt(e));

    char ch[] = new char[s.length()];
    for(int i=0; i<ch.length; i++) {
      if(sets.contains(s.charAt(i)) && !seti.contains(i))
        ch[i] = c;
      else
        ch[i] = s.charAt(i);
    }
    System.out.println(new String(ch));
  }
}
