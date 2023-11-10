import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int num = (int) Math.floor(Math.sqrt(x));
        int ans = 0;

        ans = num * 2 - 1;

        int sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;

        for (int i = num - 1; i >= 1; i--)
            sum += i;

        if (x - sum == 0)
            System.out.println(ans);
        else if (x - sum < num)
            System.out.println(ans + 1);
        else
            System.out.println(ans + (int) Math.ceil((x - sum) / (double) num));

    }

}