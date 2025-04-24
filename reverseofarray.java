import java.io.*;
// Reverse of array using normal approach with complexity O(n)
public class reverseofarray {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array:");
        String[] tmp = reader.readLine().split(" ");
        int[] arr = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }
        task1(arr);
        task2(arr);
    }
public static void task1(int arr[]) {
    int n = arr.length;
    int itr = 0;
    int [] reverse = new int[n];
    for(int i=n-1;i>=0;i--){
        reverse[n-i-1]=arr[i];
        itr++;
    }
    for(int i=0;i<reverse.length;i++){
        System.out.print(reverse[i]+" ");
    }
    System.out.println();
    System.out.println("Number of iterations: " + itr);
}

public static void task2(int arr[]) {
    int itr = 0;
    int start=0;
    int end=0;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            itr++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Number of iterations: " + itr);
    }
}

