import java.util.Scanner;
public class functionsThree {

    public static boolean checkPalindromeI(int parmeterA) {
        int copy = parmeterA;
        int newA = 0;

        while (copy != 0) {
            newA = newA * 10 + copy % 10;
            copy = copy/10;
        }
        return (parmeterA == newA) ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input = sc.nextInt();
        sc.close();

        if(checkPalindromeI(input)){
            System.out.println("Same");
        }else{
            System.out.println("diff");
        }
        
    }
}