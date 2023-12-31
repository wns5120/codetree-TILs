import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        Queue<Integer> q = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("push")) {
                q.add(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop")) {
                bw.write(String.valueOf(q.poll()));
                bw.newLine();
            } else if (command.equals("size")) {
                bw.write(String.valueOf(q.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (q.isEmpty())
                    bw.write("1");
                else
                    bw.write("0");
                bw.newLine();
            } else if (command.equals("front")) {
                bw.write(String.valueOf(q.peek()));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

}