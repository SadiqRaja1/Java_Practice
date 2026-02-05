public class Rough {
    public static void main (String args []) {
        int n = 2;
        System.out.println(monoBit(n));
    }

    public static int monoBit(int n){

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