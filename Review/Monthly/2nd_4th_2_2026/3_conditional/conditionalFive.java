import java.util.Scanner;

public class conditionalFive {

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Year : ");
        int year = sc.nextInt();

        sc.close();

        if(CheckLeap(year)) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }

    public static boolean CheckLeap (int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if( year % 400 == 0) {
                    return true;
                }else {
                    return false;
                }
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}