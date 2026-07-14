import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BeautifulPair {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        StringBuilder out = new StringBuilder();
        
        long[] minPalindromes = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 22, 11};
        
        while (t-- > 0) {
            long n = sc.nextLong();
            int rem = (int)(n % 12);
            long a = minPalindromes[rem];
            if (n >= a) {
                out.append(a).append(" ").append(n - a).append("\n");
            } else {
                out.append("-1\n");
            }
        }
        System.out.print(out.toString());
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
