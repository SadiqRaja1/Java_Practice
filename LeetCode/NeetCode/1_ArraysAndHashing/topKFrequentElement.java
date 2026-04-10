import java.util.*;
class Solution {
    
    public int[] topKFrequent(int[] nums, int k) {
        int answer [] = new int[k];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else {
                map.put(num, 1);
            }
        }
        
        HashMap <Integer, List<Integer>> reverseHashMap =  new HashMap<>();

        for (int num : map.keySet()){
            int count = map.get(num);
            if (reverseHashMap.containsKey(count)){
                reverseHashMap.get(count).add(num);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(num);
                reverseHashMap.put(count,list);
            }
        }

        int index = 0;

        for(int i=nums.length; i>=0; i--){
            if(reverseHashMap.containsKey(i)){
                for (int val : reverseHashMap.get(i)){
                    System.out.print(reverseHashMap.get(i));
                    answer[index] = val;
                    index++;
                    
                }  
                if (index == k) break;
            }
        }
        System.out.print(reverseHashMap);
        return answer;
    }
}

public class topKFrequentElement {
    public static void main (String args []) {
        int nums [] = {1,2,2,2,3,3,3,3};
        int k = 2;
        Solution obj = new Solution();

        int nums2 [] = {7,7};
        // System.out.println(Arrays.toString(obj.topKFrequent(nums, k)));

        System.out.println(Arrays.toString(obj.topKFrequent(nums2, 1)));
    }
}