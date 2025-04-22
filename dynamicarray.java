import java.io.*;

public class dynamicarray {
   public static void main(String[] args) throws IOException{
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of the array");
    int size = Integer.parseInt(reader.readLine());
    int a[] = new int[size];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<size;i++){
        a[i]=Integer.parseInt(reader.readLine());
    }
    System.out.println("Printed array elements");
    for(int i=0;i<size;i++){
        System.out.println(a[i]+" ");
    }
   }
}
