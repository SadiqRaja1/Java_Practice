import java.util.*;
public class loopsThree {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.close();

        int answer=1;
        for(int i = input; i>=1; i--) {
            answer *=i;
        }
        System.out.println(answer);
    }
}