import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int l = 0;
        int r = -1;
        int sum = 0;
        int zeros = 0;
        long ans = 0;
        while (r < n - 1) {
            r++;
            sum += a[r];
            if (a[r] == 0) {
                zeros++;
            }
            while (zeros > 1 || sum > k) {
                if (a[l] == 0) {
                    zeros--;
                }
                sum -= a[l];
                l++;
            }
            ans += r - l + 1;
        }
        System.out.println(ans);
    }
}
