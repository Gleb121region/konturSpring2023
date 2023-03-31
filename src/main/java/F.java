import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int width = Math.abs(x[i] - x[j]);
                int height = Math.abs(y[i] - y[j]);
                for (int k = 0; k < n; k++) {
                    if (k != i && k != j && Math.abs(x[k] - x[i]) == width && Math.abs(y[k] - y[i]) == height) {
                        for (int l = 0; l < n; l++) {
                            if (l != i && l != j && l != k && Math.abs(x[l] - x[j]) == width && Math.abs(y[l] - y[j]) == height) {
                                int newArea = width * height;
                                if (newArea > maxArea) {
                                    maxArea = newArea;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Максимальная площадь ковра: " + maxArea);

    }
}
