import java.io.*;

public class deleteelementarray {
    public static void main(String[] args) throws IOException{
        int size,loc;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the array:");
        size = Integer.parseInt(reader.readLine());
        int a[] = new int[size];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        System.err.println("Enter array location for element to be deleted: ");
        loc = Integer.parseInt(reader.readLine());
        for(int i=loc;i<size-1;i++){
            a[i]=a[i+1];
        }
        size -=1;
        System.out.println("Updated array");
        for(int i=0;i<size;i++){
            System.err.println(a[i]+" ");
        }
    }
}

