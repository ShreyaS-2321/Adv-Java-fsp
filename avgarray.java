import java.io.*;

public class avgarray {
    public static void main(String[] args) throws IOException{
        int a[] = new int[5];
        int sum=0;
        float avg=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements:");
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("array elements:");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        for(int i=0;i<a.length;i++){
           sum = a[i]+sum;
        }
        avg = (sum)/a.length;
        System.out.println("Avg of array elements: " + avg);
    }
}
