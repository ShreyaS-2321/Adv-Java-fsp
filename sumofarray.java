import java.io.*;

public class sumofarray {
    public static void main(String[] args) throws IOException{
        int a[] = new int[5];
        int sum =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("array elements");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        for(int i=0;i<a.length;i++){
            sum = a[i]+sum;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
