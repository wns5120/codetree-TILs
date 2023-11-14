import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static final int MAX_N = 100000;
    
    // 변수 선언
    public static int n;
    public static int[] arr = new int[MAX_N + 1];
    
    public static int ans;
    public static int negative, zero, positive;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력:
        n = sc.nextInt();
        for(int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr, 1, n + 1);
        for(int i = 1; i <= n; i++) {
            if(arr[i] < 0) negative++;
            if(arr[i] == 0) zero++;
            if(arr[i] > 0) positive++;
        }

        // 곱 중 양수가 존재할 때
        // 양수 3개의 곱이나, 양수 1개와 음수 2개의 곱이 만들어져야 가능합니다.
        if(positive >= 3 || (positive >= 1 && negative >= 2)) {
            // 양수가 3개 이상이라면, 그 중 가장 큰 3개의 수를 곱하는 것이 최선입니다.
            if(positive >= 3)
                ans = Math.max(ans, arr[n] * arr[n - 1] * arr[n - 2]);
            // 음수 2개와 양수 1개를 곱할 때에는, 음수 2개는 절댓값이 가장 큰 값을, (즉, 가장 작은 두 값)
            // 양수 1개는 가장 큰 값을 골라 곱하는 것이 최선입니다.
            if(positive >= 1 && negative >= 2)
                ans = Math.max(ans, arr[n] * arr[2] * arr[1]);
        }
        // 곱 중 0이 존재할 때
        else if(zero >= 1)
            ans = 0;
        // 곱 중 음수만 존재할 때
        // 배열에 -밖에 없거나 (negative = 1, zero = 0, positive = 2)인 경우
        // 이 경우 가장 절댓값이 작은 값 3개를 고르는 것이 최선입니다.
        else
            ans = arr[n] * arr[n - 1] * arr[n - 2];
        
        System.out.print(ans);
    }
}