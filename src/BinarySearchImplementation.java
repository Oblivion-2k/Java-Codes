public class BinarySearchImplementation {
    public static int binSearch(int[] arr, int target){
        int low = 0;
        int high = (arr.length-1);

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid]==target){
                return mid;
            }
            if( arr[mid]< target) {
                low = mid + 1;
            } else{
                high = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,77,88,99,101,102,155,166,200};
        int x = binSearch(arr1, 201);
        System.out.println(x);
    }
}
