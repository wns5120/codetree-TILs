import java.util.*;

public class Main {
    public static int n;
    public static int[] sorted_arr;

    public static void merge_function(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            merge_function(arr, low, mid);
            merge_function(arr, mid + 1, high);
            merge_sort(arr, low, mid, high);
        }
    }

    public static int[] merge_sort(int[] arr, int low, int mid, int high) {
        sorted_arr = new int[arr.length];
        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                sorted_arr[k] = arr[i];
                i++;
                k++;
            } else {
                sorted_arr[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid) {
            sorted_arr[k] = arr[i];
            k++;
            i++;
        }
        while (j <= high) {
            sorted_arr[k] = arr[j];
            j++;
            k++;
        }

        for (k = low; k <= high; k++) {
            arr[k] = sorted_arr[k];
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        merge_function(arr, 0, n - 1);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}