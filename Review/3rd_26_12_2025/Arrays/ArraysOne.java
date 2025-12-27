public class ArraysOne {

    public static boolean checkDup (int parameterNum []) {
        for(int i=0; i<parameterNum.length-1; i++) {
            for (int j = i+1; j<parameterNum.length; j++) {
                if(parameterNum[i] == parameterNum[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int num1 [] = {1,2,3,1};
        int num2 [] = {1,2,3,4};
        int num3 [] = {1,1,1,3,3,4,3,2,4,2};


        System.out.println(checkDup(num1));
        System.out.println(checkDup(num2));
        System.out.println(checkDup(num3));
    }
}