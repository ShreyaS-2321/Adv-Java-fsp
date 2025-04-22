import java.io.*;

public class smallestelementarray {
    public static void main(String[] args) throws IOException{
        int a[] = new int[5];
        int min;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Min element in the array: "+min);
    }
}

