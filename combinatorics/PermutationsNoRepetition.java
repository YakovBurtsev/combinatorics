package combinatorics;

import java.util.Arrays;

public class PermutationsNoRepetition {

    private static int count = 0;

    private static void makePermutation(int index, int n, int[] permutation, boolean[] used) {
        if (index == permutation.length) {
            count++;
            System.out.println(Arrays.toString(permutation));
        } else {
            for (int i = 1; i <= n; i++) {
                if (!used[i - 1]) {
                    used[i - 1] = true;
                    permutation[index] = i;
                    makePermutation(index + 1, n, permutation, used);
                    used[i - 1] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        makePermutation(0, 5, new int[3], new boolean[5]);

        System.out.println(count);
    }
}
