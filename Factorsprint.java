import java.io.*;

public class Factorsprint {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        int iterations = 0;
        System.out.println("O(n) Complexity");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            iterations += 1;
        }
        System.out.println("\nIterations: " + iterations);
        iterations = 0;
        System.out.println("O(logn) Complexity");
        for (int i = 1; i <= number/2; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            iterations += 1;
        }
        System.out.println(number+"\nIterations: " + iterations);
        iterations = 0;
        System.out.println("O(sqrt n) Complexity");
        for (int i = 1; i <= (int)Math.sqrt(number); i++) {
            if (number % i == 0) {
                if(i!=number/i){
                    System.out.println(i+" "+number/i);
                }
                else{
                    System.out.println(i);
                }
            }
            iterations += 1;
        }
        System.out.println("Iterations: " + iterations);
    }
}
