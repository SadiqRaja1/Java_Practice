public class methodOverloading {

    public static int add(int a, int b) {
        return a+b;
    }

    public static double add(double a, double b) {
        return a+b;
    }

    public static double add (double a, double b, double c) {
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(3,5));

        System.out.println(add(3.5, 5.5));

        System.out.println(add(1,2,3));
    }
}