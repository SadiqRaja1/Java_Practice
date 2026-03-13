public class stringFive {

    public static void main(String[] args) {
        String str = "Sadiq";
        String str1 = "Sadiq";

        StringBuffer strB = new StringBuffer(str);
        str.concat(str1);
        System.out.println(str.intern() == str1.intern());
        System.out.println(str);
        System.out.println(strB);

        strB.append(9);

        System.out.println(strB);
    }
}