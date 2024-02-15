import java.io.*;
import java.util.*;

public class SpeedingTicket {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        ArrayList<Integer> limit = new ArrayList<Integer>();
        ArrayList<Integer> actual = new ArrayList<Integer>();

        StringTokenizer st = new StringTokenizer(r.readLine());
        int limitSegments = Integer.parseInt(st.nextToken());
        int actualSegments = Integer.parseInt(st.nextToken());

        for (int i = 0; i < limitSegments; i++) {
            st  = new StringTokenizer(r.readLine());
            int segLength = Integer.parseInt(st.nextToken());
            int speedLimit = Integer.parseInt(st.nextToken());
            // pw.println("the seg length: " + segLength);

            for (int j = 0; j < segLength; j++) {
                limit.add(speedLimit);
            }
        }


        for (int i = 0; i < actualSegments; i++) {
            st  = new StringTokenizer(r.readLine());
            int segLength = Integer.parseInt(st.nextToken());
            int speed = Integer.parseInt(st.nextToken());

            for (int j = 0; j < segLength; j++) {
                actual.add(speed);
            }
        }

        int maxOver = 0;

        for (int i = 0; i < limit.size(); i++) {
            int difference = actual.get(i) - limit.get(i);

            if (difference > maxOver) {
                maxOver = difference;
            }
        }

        pw.println(maxOver);
        pw.close();
    }
}