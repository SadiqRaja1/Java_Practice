import java.util.*;
public class loopsFour {
  public static void main (String args []) {
    //System.out.print("hello");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int a = sc.nextInt();
    
    for (int i=1; i<=10; i++ ) {
      System.out.println(a+" x " + i +" = "+ a*i);
    }
  }
}