import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2 * n];
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < 2 * n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            ans = Math.min(ans, arr[i + n] - arr[i]);
        }

        System.out.println(ans);
    }

}