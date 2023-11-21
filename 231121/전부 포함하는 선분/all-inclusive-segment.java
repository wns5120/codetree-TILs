import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int a = 100;
            int b = 0;
            for (int j = 0; j < n; j++) {
                if (j == i)
                    continue;
                a = Math.min(x1[j], a);
                b = Math.max(x2[j], b);
            }
            ans = Math.min(b - a, ans);
        }
        System.out.println(ans);
    }

}