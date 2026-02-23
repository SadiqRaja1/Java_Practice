import java.util.Hashtable;

public class majorityElement169 {
    public static void main(String[] args) {
        int num1 [] = {2,2,1,1,1,2,2};

        System.out.println(findMajorityElement(num1));

        System.out.println(majorityElement(num1));
        
    }

    public static int findMajorityElement(int nums []) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for(int num : nums) {
            if(table.containsKey(num)) {
                table.replace(num, table.get(num)+1);
                
            }else{
                table.put(num, 1);
            }    
        }

        int maxCount = 0;
        int majorityElement = -1;

        for(Integer key : table.keySet()) {
            if(table.get(key) > maxCount) {
                maxCount = table.get(key);
                majorityElement = key;
            }
        }

        return majorityElement;

    }

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for(int num : nums) {
            if(count == 0) {
                candidate = num;
            }

            if(num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}