import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {
            for (int i = 1; i <= k - 1; i++) {
                q.add(q.poll());
            }
            bw.write(String.valueOf(q.poll()) + " ");
        }
        bw.flush();
        bw.close();
    }

}