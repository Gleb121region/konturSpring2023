import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        long[] imagesCon = new long[size];
        for (int i = 0; i < size; i++) {
            imagesCon[i] = in.nextInt();
        }
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (imagesCon[i] < imagesCon[minIndex]) {
                minIndex = i;
            }
            if (imagesCon[i] >= imagesCon[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.print(maxIndex + 1 + " ");
        System.out.print(minIndex + 1);

    }
}
