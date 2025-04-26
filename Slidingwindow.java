public class Slidingwindow {
    public static void main(String[] args) {
        int arr[] = {1,2,6,2,4,1};
        int k = 3;
            System.out.println(task1(arr, k));
        }
        public static int task1(int[] arr, int k){
            int start = 0, end = 0, sum = 0;
            int result = Integer.MIN_VALUE;
        for(end=0;end<arr.length;end++){
            sum+=arr[end];
            if(start==Math.abs(k-end-1)){
                result = Math.max(result,sum);
                sum-=arr[start];
                start++;
            }
        }
        return result;
    }
}
