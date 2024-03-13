import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class Kayaking {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        StringTokenizer st = new StringTokenizer(r.readLine());
        int n = Integer.parseInt(st.nextToken()); // get n
        
        int[] people = new int[2*n]; // initialize people array
        int difference = 0;

        st = new StringTokenizer(r.readLine()); // get individual people and put in array
        for (int i = 0; i < people.length; i++) {
            int x = Integer.parseInt(st.nextToken());
            people[i] = x;
        }

        Arrays.sort(people);

        // clear two heaviest people
        people[2*n-1] = 0;
        people[2*n-2] = 0;

        for (int ppl : people) {
            pw.println(ppl);
        }

        // if an array element is 0 then ignore it
        for (int i = 0; i < people.length; i++) {
            if (i % 2 == 0) { // if i is even; otherwise, skip
                int toAdd = people[i+1] - people[i];
                difference += toAdd;
                // pw.println(toAdd);
            }
        }

        pw.println(difference);

        pw.close();
    }
}
