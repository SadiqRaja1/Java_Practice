import java.util.Scanner;

public class variableThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter pencil price: ");
        int pencil = sc.nextInt();

        System.out.println("Enter pen price :");
        int pen = sc.nextInt();

        System.out.println("Enter eraser price :");
        int eraser = sc.nextInt();

        sc.close();

        int total = pencil + pen + eraser;
        System.out.println("Total bill is "+total);

        int totalWithGST = total+total*18/100;

        System.out.println("Total bill with GST is "+ totalWithGST);
    }
}