import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int ans = 0;

        ans=Math.max(Math.max(a2,x2)-Math.min(a1,x1),Math.max(b2,y2)-Math.min(b1,y1));
        System.out.println(ans*ans);
    }

}