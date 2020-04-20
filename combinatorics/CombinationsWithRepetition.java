package combinatorics;

import java.util.Arrays;

public class CombinationsWithRepetition {

    private static int count = 0;

    private static void makeCombination(int index, int n, int[] combination) {
        if (index == combination.length) {
            count++;
            System.out.println(Arrays.toString(combination));
        } else {
            int start = 1;
            if (index > 0) start = combination[index - 1];
            for (int i = start; i <= n; i++) {
                combination[index] = i;
                makeCombination(index + 1, n, combination);
            }
        }
    }

    public static void main(String[] args) {
        makeCombination(0, 5, new int[3]);

        System.out.println(count);
    }
}
