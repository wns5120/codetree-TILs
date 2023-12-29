import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<>();

        int n =sc.nextInt();

        for (int i = 0; i < n; i++) {

            String str = sc.next();

            if (str.equals("push")) {
                int A = sc.nextInt();
                s.push(A);
            } else if (str.equals("pop"))
                System.out.println(s.pop());
            else if (str.equals("size"))
                System.out.println(s.size());
            else if (str.equals("empty")) {
                if (s.empty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if (str.equals("top"))
                System.out.println(s.peek());

        }

    }

}