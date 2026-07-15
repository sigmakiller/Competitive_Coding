import java.util.Scanner;

public class PerfectRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.print(i + (i == n ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}
