import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();
        char[] arr = new char[n];
        arr = str.toCharArray();
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';

                int min_dist = Integer.MAX_VALUE;
                for (int j = 0; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[j] == '1' && arr[k] == '1') {
                            min_dist = Math.min(k - j, min_dist);
                            break;
                        }
                    }
                }
                ans = Math.max(min_dist, ans);
                arr[i] = '0';
            }
        }

        System.out.println(ans);
    }

}