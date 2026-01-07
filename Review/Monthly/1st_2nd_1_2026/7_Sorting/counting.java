import java.util.Arrays;

public class counting {

    public static void countingSort(int num []) {
        int biggestNum = 0;

        for(int i=0; i<num.length; i++) {
            biggestNum = Math.max(num[i], biggestNum);
        }
        
        int countArr [] =  new int[biggestNum+1];

        for(int i=0; i<num.length; i++) {
            countArr[num[i]]++;
        }

        int index = 0;
        for(int i=0; i<countArr.length; i++) {
            while (countArr[i] > 0) {
                num[index] = i;
                countArr[i]--;
                index++;
            }
        }

        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        int num [] = {4, 3, 0, 1, 2, 2, 5};
        countingSort(num);
    }
}