public class recursion {
    public static void main(String[] args) {
        fun(3);
        
    }

    static void fun(int n){
        if(n == 0){
            System.out.print(n + " ");
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }
}
