import java.io.*;

public class Factors{
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int result = 0, iterations =0;
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
               result +=1; 
            }
            iterations +=1;
        }
        System.out.println("Number of factors: " + result);
        System.out.println("Iterations: " + iterations);
        result = 1;
        iterations = 0;
        for (int i = 1; i <= number/2; i++){
            if (number % i == 0){
               result +=1; 
            }
            iterations +=1;
        }
        System.out.println("Number of factors: " + result);
        System.out.println("Iterations: " + iterations);
        result = 0;
        iterations = 0;
        for (int i = 1; i <= (int)Math.sqrt(number); i++){
            if (number % i == 0){
               if(i == number/i){
                   result +=1;
            }
            else{
                result +=2;
            }
            }
            iterations +=1;
        }
        System.out.println("Number of factors: " + result);
        System.out.println("Iterations: " + iterations);
    }
}