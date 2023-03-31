import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> possibleSums = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int[] dice = new int[6];
            for (int j = 0; j < 6; j++) {
                dice[j] = in.nextShort();
            }
            Set<Integer> newSums = new HashSet<>();
            for (int j = 0; j < 6; j++) {
                for (int sum : possibleSums) {
                    newSums.add(sum + dice[j]);
                }
                newSums.add(dice[j]);
            }
            possibleSums = newSums;
        }
        System.out.println(possibleSums.size());
    }
}