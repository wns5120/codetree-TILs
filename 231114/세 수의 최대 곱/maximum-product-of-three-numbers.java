import java.util.*;
import java.io.*;

public class Main {
    public static int[] arr = new int[100000];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, 0, n);
        

        if (arr[0] * arr[1] > arr[n - 2] * arr[n - 3]) {
            System.out.println(arr[0] * arr[1] * arr[n - 1]);
        } else
            System.out.println(arr[n - 1] * arr[n - 2] * arr[n - 3]);

    }

}