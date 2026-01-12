public class twoDArrayOne {

    public static void findcount (int [] [] array, int num) {
        int count = 0;
        for(int i =0; i< array.length; i++) {
            for(int j = 0; j<array[i].length; j++) {
                if(array[i][j] == num) {
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        int [] [] array = {
                {4, 7, 8},
                {8, 8 ,7}
        };
        int num = 7;

        findcount(array, num);
    }
}