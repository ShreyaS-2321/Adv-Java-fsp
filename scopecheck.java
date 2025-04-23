import java.io.*;

public class scopecheck {
    public static void main(String[] args) throws IOException {
        int x = 200;
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Before calling x: " + x);
        task1(x);
        System.out.println("After calling x: " + x); // x remains unchanged (pass-by-value)

        System.out.println("Before calling task2 (array): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        task2(arr); // modifies the original array

        System.out.println("After calling task2 (array): ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void task1(int x) {
        System.out.println("Inside task1 - Before x: " + x);
        x = -200;
        System.out.println("Inside task1 - After x: " + x);
    }

    public static void task2(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 4;
        }
    }
}
