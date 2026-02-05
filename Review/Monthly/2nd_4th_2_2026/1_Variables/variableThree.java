import java.util.*;

public class variableThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Pencil value : ");
        float Pencil = sc.nextFloat();

        System.out.println("Enter Pen value : ");
        float Pen = sc.nextFloat();

        System.out.println("Enter Eraser value : ");
        float Eraser = sc.nextFloat();

        sc.close();

        float tot = Pencil+Pen+Eraser;
        System.out.println("Total Value = " + tot);

        float totGST = tot*0.18f;
        System.out.println("Total Value with GST = "+ (tot+totGST));
    }
}