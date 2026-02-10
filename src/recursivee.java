public class recursivee {
    static int binSearchrec(int[] arr, int low, int high, int target) {
        if (high >= low) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] > target) {
                return binSearchrec(arr, low, mid - 1, target);
            } else {
                return binSearchrec(arr, mid+1,high, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int n = arr1.length-1;
        int low = 0;
        int x = 8;

        int y = binSearchrec(arr1, 0, n , x );
        System.out.println(y);
    }
}
