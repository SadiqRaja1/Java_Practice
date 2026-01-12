public class searchInSortedRowWise {

    public static int binSearch(int arr [], int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(arr[mid] == target) {
                return mid;
            }else if(arr[mid] > target) {
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return -1;

    }
    public static void searchRowWise(int matrix[] [], int target) {
        int check = -1;
        for(int i = 0; i<matrix.length; i++) {
            check = binSearch(matrix[i], target);
            if(check != -1) {
                System.out.println("Value found on index "+ i + " , "+ check);
                return;
            }
        }
        if(check == -1) {
            System.out.println("Target not present in the matrix");
        }

    }
    public static void main(String[] args) {

        int matrix [] [] = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29, 37, 48},
                {32, 33, 39, 50}
        };
        int target = 33;

        searchRowWise(matrix, target);

    }
}
