public class methodOverloading {

    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c) {
        return a+b+b;
    }
    public static float add (float a, float b) {
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(add(1,3));
        System.out.println(add(1.5f, 2.5f));
        System.out.println(add(1,2,1));
    }
}