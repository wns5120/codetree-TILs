import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[7];
        int cnt = 0;
        int a, b, c;

        for (int i = 0; i < 7; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        a = arr[0];
        b = arr[1];
        c = arr[6] - a - b;

        System.out.println(a + " " + b + " " + c);
    }

}