import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int m = sc.nextInt();
        int[] wifi = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (m >= n && arr[i] == 1) {
                System.out.println(1);
                System.exit(0);
            }
            if (arr[i] == 1) {
                wifi[i + m] = 1;
                i += m;
            }

        }

        int ans = 0;

        for (int i = 0; i < n; i++)
            if (wifi[i] == 1)
                ans++;


        System.out.println(ans);
    }

}