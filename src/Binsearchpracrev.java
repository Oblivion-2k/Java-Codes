public class Binsearchpracrev {
    public static int binSearchRec(int[] arr, int low, int high, int target){
        if(high >=low) {
            int mid = (low + high) / 2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                return binSearchRec(arr, low, mid-1,target);
            }else{
                return binSearchRec(arr,mid+1, high, target);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr1 = {10,12,47,55,97,201,605,1101};
        int l=0;
        int h = arr1.length;
        int t=971;
        int x = binSearchRec(arr1, l , h-1, t);
        if(x ==-1){
            System.out.println("The element "+ t + " was not found");
        }else{
            System.out.println("The element "+ t + " was found at index: " + x );

        }

    }
}
