import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[n];
        arr = sc.next().toCharArray();
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] == '0') {
                arr[i] = '1';

                int min_dist = n;
                for (int j = 0; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (arr[j] == '1' && arr[k] == '1') {
                            min_dist = Math.min(min_dist, k - j);
                            break;
                        }
                    }
                }
                arr[i] = '0';
                ans = Math.max(ans, min_dist);
            }
        }
        System.out.println(ans);
    }

}