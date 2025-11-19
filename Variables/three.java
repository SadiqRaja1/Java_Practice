import java.util.Scanner;

public class three {

    static float addGST (float amount){
        return amount += amount*18/100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pencil number: ");
        float pencil = sc.nextInt();

        System.out.print("Enter the pen number: ");
        float pen = sc.nextInt();

        System.out.print("Enter the eraser number: ");
        float eraser = sc.nextInt();
        sc.close();

        float total = pencil + pen + eraser;

        System.out.println("Total bill amount is: "+ total);
        System.out.println("Total bill amount is: "+ addGST(total));
    }
}