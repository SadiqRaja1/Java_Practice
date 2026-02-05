import java.util.*;

public class variableTwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side : ");
        int side = sc.nextInt();

        sc.close();
        
        System.out.println("Area of the square :" +  side*side);
    }
}