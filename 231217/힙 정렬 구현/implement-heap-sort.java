import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int[] arr;

    public static void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void h_ify(int[] arr, int n, int i) {
        int largest = i;
        int left = i * 2;
        int right = i * 2 + 1;

        if (left <= n && arr[left] > arr[largest])
            largest = left;
        if (right <= n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            swap(largest, i);
            h_ify(arr, n, largest);
        }

    }

    public static void heap_sort(int[] arr, int n) {
        for (int i = n / 2; i >= 1; i--) {
            h_ify(arr, n, i);
        }

        for (int i = n; i > 1; i--) {
            swap(i, 1);
            h_ify(arr, i - 1, 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        heap_sort(arr, n);

        for (int i = 1; i <= n; i++) {
            bw.write(String.valueOf(arr[i]) + " ");
        }
        bw.flush();
    }

}