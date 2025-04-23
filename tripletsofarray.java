import java.util.Arrays;

public class tripletsofarray {
    public static int countDistinctTriplets(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
        int n = arr.length;
        int count = 0;

        // Iterate through the array to fix 'c'
        for (int k = 2; k < n; k++) {
            int c = arr[k];
            int i = 0, j = k - 1;

            // Use two pointers to find pairs (a, b) such that a + b = c
            while (i < j) {
                int sum = arr[i] + arr[j];
                if (sum == c) {
                    count++;
                    i++;
                    j--;

                    // Skip duplicates for 'a' and 'b'
                    while (i < j && arr[i] == arr[i - 1]) i++;
                    while (i < j && arr[j] == arr[j + 1]) j--;
                } else if (sum < c) {
                    i++;
                } else {
                    j--;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Number of distinct triplets: " + countDistinctTriplets(arr));
    }
}
