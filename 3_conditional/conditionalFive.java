import java.util.Scanner;

public class conditionalFive {

    public static boolean checkLeap (int parameterLeap) {
        
        if(parameterLeap%4 != 0){
            return false;
        }else if (parameterLeap%100 != 0){
            return true;
        }else if (parameterLeap%400 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.print("Plese Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if (checkLeap(year)) {
            System.out.println("Leap Year");

        }else {
            System.out.println("Not a leap year");
        }
        
    }
}