import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] first = new int[n + 1];
        int a_score = 0;
        int b_score = 0;
        int ans = 0;

        for (int i = 1; i <= n; i++) {
            char c = sc.next().charAt(0);
            int s = sc.nextInt();

            if (c == 'A')
                a_score += s;
            else
                b_score += s;

            if (a_score > b_score)
                first[i] = 1;
            else if (a_score < b_score)
                first[i] = 2;
            else
                first[i] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            if (first[i] != first[i - 1])
                ans++;
        }
        System.out.println(ans);
    }

}