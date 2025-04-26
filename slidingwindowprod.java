// Sliding Window approach for prod of maximum
public class slidingwindowprod {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 2, 4, 1};
        int k = 3;
        System.out.println(task1(arr, k));
    }

    public static int task1(int[] arr, int k) {
        int start = 0, product = 1;
        int result = Integer.MIN_VALUE;

        for (int end = 0; end < arr.length; end++) {
            product *= arr[end];
            if (end - start + 1 == k) {
                result = Math.max(result, product);
                product /= arr[start];
                start++; 
            }
        }
        return result;
    }
}
