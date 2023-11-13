import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int ans = 0;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < min2 && arr[i] != min)
                min2 = arr[i];
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min2) {
                cnt++;
                ans = i;
            }
        }
        if (cnt > 1 || min2 == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans+1);
    }

}