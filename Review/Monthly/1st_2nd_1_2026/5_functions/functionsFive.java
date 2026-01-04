public class functionsFive {

    public static void DigitSum(int parameterNum) {
        int sum = 0;

        while (parameterNum > 0) {
            sum += parameterNum % 10;
            parameterNum /= 10;
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        int num1 = 123;
        int num2 = 54321;
        int num3 = 9146;

        DigitSum(num1);
        DigitSum(num2);
        DigitSum(num3);
    }
}