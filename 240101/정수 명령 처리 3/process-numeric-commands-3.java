import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("push_front")) {
                dq.addFirst(Integer.parseInt(st.nextToken()));
            } else if (command.equals("push_back")) {
                dq.addLast(Integer.parseInt(st.nextToken()));
            } else if (command.equals("pop_front")) {
                bw.write(String.valueOf(dq.pollFirst()));
                bw.newLine();
            } else if (command.equals("pop_back")) {
                bw.write(String.valueOf(dq.pollLast()));
                bw.newLine();
            } else if (command.equals("size")) {
                bw.write(String.valueOf(dq.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (dq.isEmpty())
                    bw.write("1");
                else
                    bw.write("0");
                bw.newLine();
            } else if (command.equals("front")) {
                bw.write(String.valueOf(dq.peekFirst()));
                bw.newLine();
            } else if (command.equals("back")) {
                bw.write(String.valueOf(dq.peekLast()));
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
    }

}