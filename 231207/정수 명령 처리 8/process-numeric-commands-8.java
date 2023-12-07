import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String str = sc.next();

            if (str.equals("push_front")) {
                int a = sc.nextInt();
                arr.addFirst(a);
            } else if (str.equals("push_back")) {
                int a = sc.nextInt();
                arr.addLast(a);
            } else if (str.equals("pop_front")) {
                System.out.println(arr.pollFirst());
            } else if (str.equals("pop_back")) {
                System.out.println(arr.pollLast());
            } else if (str.equals("size")) {
                System.out.println(arr.size());
            } else if (str.equals("empty")) {
                if (arr.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if (str.equals("front")) {
                System.out.println(arr.peekFirst());
            } else if (str.equals("back")) {
                System.out.println(arr.peekLast());
            }
        }
    }

}