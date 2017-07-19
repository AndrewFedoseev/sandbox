package basictests;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by Andrii.Fiedosieiev on 6/28/2017.
 */
public class Fib {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        int quantity = 10;

        for (int i = 1; i <= quantity; i++) {
            System.out.print(f + " ");
            f = f + g;
            g = f - g;
        }

        System.out.println();
    }
}
