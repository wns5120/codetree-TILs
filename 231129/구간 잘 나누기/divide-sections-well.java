import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int ans = Integer.MAX_VALUE;
        int max=0;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for(int i=0;i<n;i++)
            max=Math.max(arr[i],max);

        for (int i = max; i < 100 * 100 + 1; i++) {
            int cnt = 0;
            int sum = arr[0];
            for (int j = 1; j < n; j++) {
                if (sum + arr[j] < i) {
                    sum += arr[j];
                } else {
                    cnt++;
                    sum = arr[j];
                }
            }
            if (cnt <= m)
                ans = Math.min(ans, i);
        }
        System.out.println(ans);
    }

}