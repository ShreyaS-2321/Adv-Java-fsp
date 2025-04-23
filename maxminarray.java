import java.io.*;
import java.util.*;

public class maxminarray {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = reader.readLine().split(" ");
        int [] nos = new int [tmp.length];
        for(int i=0;i<tmp.length;i++){
            nos[i]=Integer.parseInt(tmp[i]);
        }
        task1(nos);
        task2(nos);
}
public static void task1(int arr[]){
    Arrays.sort(arr);
    System.out.println(arr[0]+" "+arr[arr.length-1]);
}
public static void task2(int arr[]){
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    int smax = Integer.MIN_VALUE;
    int tmax = Integer.MIN_VALUE;

    for (int ele : arr) {
        if (ele > max) {
            tmax = smax;
            smax = max;
            max = ele;
        } else if (ele > smax && ele != max) {
            tmax = smax;
            smax = ele;
        } else if (ele > tmax && ele != max && ele != smax) {
            tmax = ele;
        }
        min = Math.min(ele, min);
    }
    System.out.println(min+" "+max+" "+smax+" "+tmax);  
}
}

