import java.util.Scanner;

public class conditionalThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day");
        int input = sc.nextInt();

        sc.close();

        switch (input) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input (Enter number between 1 to 7");
                break;
        }
    }
}