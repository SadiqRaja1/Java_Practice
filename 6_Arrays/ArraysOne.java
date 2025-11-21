public class ArraysOne {

    public static boolean dupCheck(int [] parameterInput) {
        for(int i=0; i<parameterInput.length; i++) {
            for(int j=i+1; j<parameterInput.length; j++) {
                if(parameterInput[i] == parameterInput[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int input1 [] = {1,2,3,1};
        int input2 [] = {1,2,3,4};
        int input3 [] = {1,1,1,3,3,4,3,2,4,2};

        System.out.println("Input1 dupplicate present : "+ dupCheck(input1));
        System.out.println("Input2 dupplicate present : "+ dupCheck(input2));
        System.out.println("Input3 dupplicate present : "+ dupCheck(input3));
    }
}