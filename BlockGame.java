import java.io.*;
import java.util.*;

public class BlockGame {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int[] alphabet = new int[26];
        int[] word1 = new int[26];
        int[] word2 = new int[26];

        // ascii values lowercase: 97-122 -> minus 97 for 0-25
        // for each block, add individual ascii letters to a set (eliminates repeats)
        // iterate through the set, subtracting each value by 97 and adding one to alphabet array with number denoting position
        // clear set
        // next block

        StringTokenizer st = new StringTokenizer(r.readLine());
        int numOfIter = Integer.parseInt(st.nextToken());

        for (int i = 0; i < numOfIter; i++) {
            st = new StringTokenizer(r.readLine());
            // iterate through entire input

            String firstWord = st.nextToken();

            for (int k = 0; k < firstWord.length(); k++) {
                // iterate through each word
                word1[(int) firstWord.charAt(k) - 97] += 1;
            }



        }

        for (int z : alphabet) {
            pw.println(z);
        }

        pw.close();
    }
}