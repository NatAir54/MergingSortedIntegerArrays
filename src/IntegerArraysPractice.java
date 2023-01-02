import java.util.Arrays;
import java.util.stream.IntStream;

/*
* Write a function that merges two sorted arrays into a single one.
* The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.
 */

public class IntegerArraysPractice {
    public static void main(String[] args) {
        int[] first = {3, 7, 2, 8, 7, 9};
        int[] second = {2, 5, 5, 6, 1, 2, 8};

        System.out.println(Arrays.toString((mergeArrays(first, second))));
    }

    public static int[] mergeArrays(int[] first, int[] second) {
        return IntStream
                .concat(IntStream.of(first), IntStream.of(second))
                .distinct()
                .sorted()
                .toArray();
    }
}
