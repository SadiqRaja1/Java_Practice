import java.util.Scanner;

public class three {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of pencil : ");
        float pencil = sc.nextInt();

        System.out.println("Enter the cost of pen : ");
        float pen = sc.nextInt();

        System.out.println("Enter the cost of eraser : ");
        float eraser = sc.nextInt();

        sc.close();

        float total = (pencil + pen + eraser);
        System.out.println("Totat cost is :" + total);

        float totalWithGST = total + (total * 18 /100);

        System.out.println("Total cost with GST is :" + totalWithGST);
    }
}