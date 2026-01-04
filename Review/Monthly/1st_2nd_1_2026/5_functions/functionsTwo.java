public class functionsTwo {

    public static boolean isEven (int parameterNum) {
        return (parameterNum % 2 == 0)? true : false;
    }
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        int num3 = 8;
        int num4 = 9303;

        System.out.println(isEven(num1));
        System.out.println(isEven(num2));
        System.out.println(isEven(num3));
        System.out.println(isEven(num4));
    }
}