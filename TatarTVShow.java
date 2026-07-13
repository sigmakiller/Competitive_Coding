import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TatarTVShow {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String tStr = sc.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            
            int[] counts = new int[k];
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    counts[i % k]++;
                }
            }
            
            boolean possible = true;
            for (int i = 0; i < k; i++) {
                if (counts[i] % 2 != 0) {
                    possible = false;
                    break;
                }
            }
            
            if (possible) {
                out.append("YES\n");
            } else {
                out.append("NO\n");
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

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
