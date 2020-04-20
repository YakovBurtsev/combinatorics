package combinatorics;

import java.util.Arrays;

public class PermutationsWithRepetition {

    private static int count = 0;

    private static void makePermutation(int index, int n, int[] permutation) {
        if (index == permutation.length) {
            count++;
            System.out.println(Arrays.toString(permutation));
        } else {
            for (int i = 1; i <= n; i++) {
                permutation[index] = i;
                makePermutation(index + 1, n, permutation);
            }
        }
    }

    public static void main(String[] args) {
        makePermutation(0, 5, new int[3]);

        System.out.println(count);
    }
}
