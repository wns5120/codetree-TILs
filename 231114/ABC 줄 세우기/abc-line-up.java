import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] arr = new char[n];
        int cnt = 0;

        for (int i = 0; i < n; i++)
            arr[i] = sc.next().charAt(0);

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }

}