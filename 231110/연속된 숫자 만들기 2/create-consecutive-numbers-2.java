import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (Math.abs(a - b) == 1 && Math.abs(b - c) == 1)
            System.out.println(0);
        else if (Math.abs(a - b) == 2 || Math.abs(c - b) == 2)
            System.out.println(1);
        else
            System.out.println(2);
    }

}