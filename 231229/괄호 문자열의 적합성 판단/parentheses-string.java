import java.util.*;
import java.io.*;

public class Main {
    public static Stack<Character> s = new Stack<>();

    public static boolean check(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(')
                s.push('(');
            else if (str.charAt(i) == ')') {
                if (s.empty())
                    return false;
                else
                    s.pop();
            }
        }
        if (s.empty())
            return true;
        else
            return false;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        Scanner sc = new Scanner(System.in);
        Stack<Character> s = new Stack<>();

        String str = br.readLine();

        if (check(str))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}