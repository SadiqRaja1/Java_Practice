public class countMonobitInteger {
    public static void main(String args []) {
        System.out.println(countMonobit(7));
    }

    public static int countMonobit(int n) {
        int count = 0;
        int helper = 0;

        for(int i=0; i<=n; i++){
            if(i == helper){
                count++;
                helper = helper*2+1;
            }
        }

        return count;
    }

}
