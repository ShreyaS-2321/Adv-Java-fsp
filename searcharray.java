import java.io.*;

public class searcharray {
    public static void main(String[] args) throws IOException{
        int a[] = new int[5];
        int x;
        int count=0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements");
        for(int i=0;i<a.length;i++){
            a[i] = Integer.parseInt(reader.readLine());
        }
        System.out.println("array elements");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println("Enter the element to search: ");
        x = Integer.parseInt(reader.readLine());
        for(int i=0;i<a.length;i++){
            if(a[i]==x){
                count +=1;
            }
        }
        if(count>0){
            System.out.println("Searched element is present in array "+count+" times");
        }
        else System.out.println("Searched element is not present in array");
    }
}
