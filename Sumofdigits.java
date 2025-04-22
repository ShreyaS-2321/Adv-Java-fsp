import java.io.*;

public class Sumofdigits{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        int sum = 0;
        int number = Integer.parseInt(reader.readLine());
        String tmp = Integer.toString(number);
        for (char ch : tmp.toCharArray()){
            sum += Character.getNumericValue(ch);
            count += 1;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count: " + count);
        sum = 0;
        count =0;
        while(number>0){
            sum += number % 10;
            number /= 10;
            count += 1;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count: " + count);
    }
}
