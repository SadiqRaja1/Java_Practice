public class methodOverloading{
    static int add(int parameterA, int parameterB) {
        return parameterA + parameterB;
    }
    
    static double add (double parameterA, double parameterB) {
        return parameterA + parameterB;
    }

    static int add (int parameterA, int parameterB, int parameterC) {
        return parameterA+parameterB+parameterC;
    }
    public static void main(String[] args) {
        System.out.println(add(1,1));
        System.out.println(add(1.1,1.9));
        System.out.println(add(1,2,3));

    }
}