import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        int[] wifi = new int[n+100];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                wifi[i + m] = 1;
                i += (m + 1);
            }
        }

        int ans = 0;

        for (int i = 0; i < n+100; i++)
            if (wifi[i] == 1)
                ans++;

        System.out.println(ans);
    }

}