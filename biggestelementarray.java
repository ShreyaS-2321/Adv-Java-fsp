import java.io.*;

public class biggestelementarray {
    public static void main(String[] args) throws IOException{
        int a[] = new int[5];
        int max;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(reader.readLine());
        }
        max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max element in the array: "+max);
    }
}
