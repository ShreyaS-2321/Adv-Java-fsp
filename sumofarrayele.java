// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;

public class sumofarrayele {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = reader.readLine().split(" ");
        int [] nos = new int [tmp.length];
        for(int i=0;i<tmp.length;i++){
            nos[i]=Integer.parseInt(tmp[i]);
        }
        int sum1 = sumofarrayelements(nos);
        System.out.println(sum1);
        int sum2 = sumofalternatearrayelements(nos);
        System.out.println(sum2);
    }
    public static int sumofarrayelements(int arr[]){
    int sum =0;
    for(int ele:arr){
        sum+=ele;
    }
    return sum;
}

public static int sumofalternatearrayelements(int arr[]){
    int sum =0;
    for(int i=0;i<arr.length;i++){
        if(i%2==0){
            sum+=arr[i];
        }
    }
    return sum;
}

}

