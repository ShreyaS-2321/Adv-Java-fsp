import java.io.*;
public class subarray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the array:");
        String[] tmp = reader.readLine().split(" ");
        int[] nos = new int[tmp.length];
        for (int i = 0; i < tmp.length; i++) {
            nos[i] = Integer.parseInt(tmp[i]);
        }
        System.out.println("rightmost subarray is:");
        for(int i=0;i<nos.length;i++){
            System.out.print(nos[i]+"=>");
            for(int j=i;j<nos.length;j++){
                System.out.print(nos[j]+" ");
            }
            System.out.println();
        }
        System.out.println("leftmost subarray is:");
        for(int i=0;i<nos.length;i++){
            System.out.print(nos[i]+"=>");
            for(int j=i;j>=0;j--){
                System.out.print(nos[j]+" ");
            }
            System.out.println();
        }
}
}