public class methodOverloading {

    public static void main(String[] args) {
        int a = 5, b = 5;

        sum(a,b);

        int c = 5;

        sum(a,b,c);

        float x = 3.5f;
        float y = 6.5f;

        sum(x, y);
    }

    public static void sum(int a, int b) {
        System.out.println(a+b);
    }

    public static void sum (float x, float y) {
        System.out.println(x+y);
    }

    public static void sum(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}