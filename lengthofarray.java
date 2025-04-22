import java.io.*;

public class lengthofarray {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[5];
        System.out.println("Enter elements in array");
        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("Array element");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Array Length: "+a.length);
    }
}
