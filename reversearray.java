import java.io.*;

public class reversearray {
    public static void main(String[] args) throws IOException {
        int a[] = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter elements of array");
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("Array elements");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Reverse array elements");
        for(int i=a.length-1;i>=0;i--){
            System.out.println(a[i]+" ");
        }
    }
}
