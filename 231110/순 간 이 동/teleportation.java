import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = Integer.MAX_VALUE;

        int case1 = Math.abs(a - b);
        ans = Math.min(ans, case1);

        int case2 = Math.abs(a - x) + Math.abs(b - y);
        ans = Math.min(ans, case2);

        int case3 = Math.abs(a - y) + Math.abs(b - x);
        ans = Math.min(ans, case3);

        System.out.println(ans);
    }

}