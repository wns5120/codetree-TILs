import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] arr = new char[10][10];
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        int void_x = 0;
        int void_y = 0;

        for (int i = 0; i < 10; i++) {
            String str = sc.next();
            for (int j = 0; j < 10; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (arr[i][j] == 'L') {
                    x1 = i;
                    y1 = j;
                } else if (arr[i][j] == 'B') {
                    x2 = i;
                    y2 = j;
                } else if (arr[i][j] == 'R') {
                    void_x = i;
                    void_y = j;
                }
            }
        }
        
        if (Math.abs(x1 - x2) == 0 && void_y > Math.min(y1, y2) && void_y < Math.max(y1, y2))
            System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2) - 1 + 2);
        else if (Math.abs(y1 - y2) == 0 && void_x > Math.min(x1, x2) && void_x < Math.max(x1, x2))
            System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2) - 1 + 2);
        else
            System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2) - 1);
    }

}