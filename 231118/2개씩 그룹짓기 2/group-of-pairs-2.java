import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static final int MAX_N = 100000;
    
    public static int n;
    public static int[] arr = new int[2 * MAX_N];
    public static int ans = INT_MAX;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력
        n = sc.nextInt();
        for(int i = 1; i <= 2 * n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr, 1, 2 * n + 1);

        // 정렬한 뒤 1번째 값과 n + 1번째 값, 2번째 값과 n + 2번째 값, ... n번째 값과 2n번째 값의
        // 차이를 구합니다. 구한 값들의 최솟값을 찾습니다.
        for(int i = 1; i <= n; i++) {
            ans = Math.min(ans, arr[n + i] - arr[i]);
        }

        System.out.print(ans);
    }
}