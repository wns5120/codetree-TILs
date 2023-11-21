import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = n - 1; i >= 1; i--) {
            if (arr[i] < arr[i - 1]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }

}