import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        LinkedList<Character> code = new LinkedList<>();
        String str = sc.next();

        for (int i = 0; i < str.length(); i++)
            code.add(str.charAt(i));

        ListIterator<Character> it = code.listIterator(code.size());

        for (int i = 0; i < m; i++) {
            char c = sc.next().charAt(0);

            if (c == 'L') {
                if (it.hasPrevious())
                    it.previous();
            } else if (c == 'R') {
                if (it.hasNext())
                    it.next();
            } else if (c == 'D') {
                it.remove();
            } else if (c == 'P') {
                char pb = sc.next().charAt(0);
                it.add(pb);
                if (it.hasNext())
                    it.next();
            }
        }
        it = code.listIterator();

        while (it.hasNext())
            System.out.print(it.next());
    }

}