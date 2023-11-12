import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int ans = Math.max(Math.abs(arr[1] - arr[0]), Math.abs(arr[1] - arr[2]));

        System.out.println(ans - 1);

    }

}