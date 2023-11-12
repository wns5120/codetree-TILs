import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int aw = 0;
        int bw = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == 1) {
                if (b[i] == 2)
                    aw++;
                else if (b[i] == 3)
                    bw++;
            } else if (a[i] == 2) {
                if (b[i] == 3)
                    aw++;
                else if (b[i] == 1)
                    bw++;
            } else if (a[i] == 3) {
                if (b[i] == 1)
                    aw++;
                else if (b[i] == 2)
                    bw++;
            }
        }
        System.out.println(Math.max(aw, bw));
    }

}