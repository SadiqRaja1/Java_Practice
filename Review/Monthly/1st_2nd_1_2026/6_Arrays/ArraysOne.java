import java.util.HashSet;

public class ArraysOne {

    // public static boolean dupCheck(int parameterNum []) {
    //     for(int i=0; i<parameterNum.length; i++) {
    //         for(int j = i+1; j<parameterNum.length; j++) {
    //             if(parameterNum[i] == parameterNum[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    public static boolean dupCheck(int parameterNum []) {
        HashSet<Integer> hash = new HashSet<>();

        for(int i=0; i<parameterNum.length; i++) {
            if(hash.contains(parameterNum[i])) {
                return true;
            }else{
                hash.add(parameterNum[i]);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int nums1 [] = {1, 2, 3, 1};

        int nums2 [] = {1,2,3,4};

        int nums3 [] = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(dupCheck(nums1));
        System.out.println(dupCheck(nums2));
        System.out.println(dupCheck(nums3));

    }

}
