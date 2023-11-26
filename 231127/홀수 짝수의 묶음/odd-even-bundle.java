import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int odd = 0;
        int even = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        if (even > odd) {
            ans = odd * 2 + 1;
        } else if (odd > even) {
            ans = even * 2;
            odd -= even;
            if (odd % 3 == 0) {
                ans += (odd / 3 * 2);
            } else if (odd % 3 == 1)
                ans += (odd / 3 * 2 - 1);
            else if (odd % 3 == 2)
                ans += (odd / 3 * 2 + 1);
        } else
            ans = even + odd;

        System.out.println(ans);

    }

}