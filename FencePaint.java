import java.io.*;
import java.util.StringTokenizer;

// difficulty: very easy
public class FencePaint {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int painted = 0;

        StringTokenizer st = new StringTokenizer(r.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(r.readLine());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int[] rows = new int[100];

        for (int i = a; i < b; i++) {
            rows[i] = 1;
        }

        for (int j = c; j < d; j++) {
            rows[j] = 1;
        }

        for (int f : rows) {
            painted += f; // empty row of integer array = 0
        }

        pw.println(painted);
        
        // int[] test = new int[10];
        // for (int i : test) {pw.println(i);}

        pw.close();
    }
}
