public class StringFive {

    public static void main(String[] args) {
        //string intern used to check the pool for the same value or it will add it. as new String stored in heap. intern() over use not advisable
        String a = new String("Sadiq");
        String b = a.intern();

        System.out.println(b);

        //String is Slow, immutable, threadsafe / StringBuffer is Slower, mutable, threadsafe synchronized / StringBuilder Fast, muatble, non- threadSafe
        StringBuffer c = new StringBuffer("Sadiq");
        System.out.println(c);
    }
}