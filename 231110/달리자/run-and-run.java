import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int ans = 0;

        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            b[i] = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                int num = a[i] - b[i];
                a[i] -= num;
                a[i + 1] += num;
                ans += num;
            }
        }
        System.out.println(ans);
    }

}