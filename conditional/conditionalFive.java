import java.util.Scanner;

public class conditionalFive {

    public static void main(String[] args) {
        System.out.print("Plese Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        if(year%4 != 0){
            System.out.println("Not a leap year");
        }else if (year%100 != 0){
            System.out.println("Leap year");
        }else if (year%400 == 0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not a leap year");
        }
        
    }
}