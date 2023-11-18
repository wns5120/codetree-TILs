import java.util.*;
import java.io.*;

public class Main {
    public static int n = 15;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[n];
        int a, b, c, d;

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[n - 1] - a - b - c;

        System.out.println(a + " " + b + " " + c + " " + d);
    }

}