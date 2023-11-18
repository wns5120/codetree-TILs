import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int hol = 0;
        int zak = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0)
                zak++;
            else
                hol++;
        }

        if (zak == 0) {
            System.out.println(hol / 2);
            System.exit(0);
        }
        if (hol == 0) {
            System.out.println(1);
            System.exit(0);
        }

        ans = Math.min(hol, zak) * 2;
        hol -= Math.min(hol, zak);
        zak -= Math.min(hol, zak);

        if (hol > 0) {
            ans += hol / 2 + 1;
        } else {
            ans++;
        }
        System.out.println(ans);
    }

}