package basictests;

/**
 * Created by Andrii.Fiedosieiev on 6/28/2017.
 */
public class Fib1 {
    public static void main(String[] args) {

        int fibo = 1;
        int fibo1 = 2;
        int quantity = 10;


        for (int i = 0; i < quantity; i++) {
            System.out.print(fibo + " ");
            fibo = fibo + fibo1;
            fibo1 = fibo - fibo1;
        }
    }
}
