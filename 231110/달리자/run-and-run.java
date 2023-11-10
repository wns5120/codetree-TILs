import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();

        for (int i = 0; i < n; i++)
            B[i] = sc.nextInt();

        int sum = 0;
        boolean check = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                check = true;
                if (A[i] > B[i] && B[j] > A[j]) {
                    sum += ((A[i] - B[i]) * (j - i));
                    A[j] += (A[i] - B[i]);
                    A[i] = B[i];
                }
            }

            for (int k = 0; k < n; k++) {
                if (A[k] != B[k])
                    check = false;
            }
            if (check) {
                System.out.println(sum);
                System.exit(0);
            }
        }
        System.out.println(0);
    }

}