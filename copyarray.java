import java.io.*;

public class copyarray {
    public static void main(String[] args) throws IOException {
        int a[] = new int[5];
        int b[] = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of first array");
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("first array");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("copy array");
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
            System.out.println(b[i]+" ");
        }
    }
}
