import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        int A = 0;
        int B = 0;
        int C = 0;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if (c == 'A')
                A += s;
            else if (c == 'B')
                B += s;
            else if (c == 'C')
                C += s;

            if (A > B && A > C)
                arr[i] = 1;
            else if (B > A && B > C)
                arr[i] = 2;
            else if (C > A && C > B)
                arr[i] = 3;
            else if (A == B && A > C)
                arr[i] = 4;
            else if (B == C && B > A)
                arr[i] = 5;
            else if (A == C && A > B)
                arr[i] = 6;
            else
                arr[i] = 0;

        }

        for (int i = 1; i < n + 1; i++) {
            if (arr[i] != arr[i - 1])
                ans++;
        }
        System.out.println(ans);
    }

}