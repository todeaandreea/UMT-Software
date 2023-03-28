import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       Integer[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean result = splitArray(A);
        System.out.println("Result: " + result);

    }

    public static boolean splitArray(Integer[] A) {

        // We sort the array A in descending order
        Arrays.sort(A, Collections.reverseOrder());


        // Initialize the sum variables for the 2 subsets: B and C
        int sumB = 0;
        int sumC = 0;

        // Initialize the variables for the lengths of the two subsets, B and C.
        int lenB = 0;
        int lenC = 0;

        // We traverse the array in descending order and split it between the two subsets: B and C.
        for (int i : A) {
            if (sumB <= sumC) {  // Add the element to subset B if the sum of the elements in B is less than or equal to the sum of the elements in C.
                sumB += i;
                lenB++;
            } else {  // Otherwise, we add the element to subset C.
                sumC += i;
                lenC++;
            }
        }


        // Check if the 2 subsets (B and C) are non-empty and have the same arithmetic mean.
        return lenB > 0 && lenC > 0 && sumB * lenC == sumC * lenB;
    }

}

