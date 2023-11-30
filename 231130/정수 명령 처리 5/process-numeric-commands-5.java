import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String str = sc.next();
            int a;

            if (str.equals("push_back")) {
                a = sc.nextInt();
                arr.add(a);
            } else if (str.equals("pop_back"))
                arr.remove(arr.size() - 1);
            else if (str.equals("get")) {
                a = sc.nextInt();
                System.out.println(arr.get(a - 1));
            } else
                System.out.println(arr.size());

        }
    }

}