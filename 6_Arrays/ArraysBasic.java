import java.util.Arrays;

public class ArraysBasic {
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        
        String fruits [] = {"apple", "banana", "mango"};

        char character [] = {'a', 'b', 'c','d', 'e'};

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(fruits));
        System.out.println(Arrays.toString(character));

        System.out.println(num.length);
        fruits[0] = "jackfruit";

        System.out.println(Arrays.toString(fruits));

        int newNum []= new int[20];
        
        
    }
    
}
