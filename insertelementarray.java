import java.io.*;

public class insertelementarray {
    public static void main(String[] args) throws IOException{
        int size,loc,item;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of the array:");
        size = Integer.parseInt(reader.readLine());
        int a[] = new int[size+1];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        System.err.println("Enter array location for new element: ");
        loc = Integer.parseInt(reader.readLine());
        System.out.println("Enter new element: ");
        item = Integer.parseInt(reader.readLine());

        for(int i=size;i>loc;i--){
            a[i]=a[i-1];
        }
        a[loc]=item;
        size +=1;
        System.out.println("Updated array");
        for(int i=0;i<size;i++){
            System.out.println(a[i]+" ");
        }
    }
}
