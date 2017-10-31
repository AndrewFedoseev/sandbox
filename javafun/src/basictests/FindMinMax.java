package basictests;

import java.lang.reflect.Array;

/**
 * Created by Andrii.Fiedosieiev on 10/31/2017.
 */
public class FindMinMax {
    public static void main(String[] args) {
        int[] array = {9, 8, 5, 6, 1, -1, 15};

        int result = 0;
        int min = 0;
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            if (min > array[i]) {
                min = array[i];
            }
        }
        result = max - min;
        System.out.println("Max is " + max + ", Min is " + min + " and the result is " + result);
    }
}
