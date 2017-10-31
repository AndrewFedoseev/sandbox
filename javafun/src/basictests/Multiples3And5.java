package basictests;

/**
 * Created by Andrii.Fiedosieiev on 7/25/2017.
 * <p>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * <p>
 * Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Multiples3And5 {
    public static void main(String[] args) {
        int fig = 1000;
        int fig1 = 5;
        int fig2 = 3;
        int sum = 0;

        for (int i = 0; i < fig; i++) {
            if ((i % fig1) == 0 || (i % fig2) == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
