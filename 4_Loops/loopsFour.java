import java.util.Scanner;

public class loopsFour {

    public static void printTable(int parameterNum){
        for(int i=1; i<=10; i++) {
            System.out.printf("%-2d" + " x " + "%-2d" + " = " + "%-10d" + "%n",parameterNum, i, parameterNum+i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("please enter the number for printing it's table: ");
        int input = sc.nextInt();
        sc.close();

        printTable(input);

    }
}