package basictests;

/**
 * Created by Andrii.Fiedosieiev on 7/26/2017.
 * The prime factors of 13195 are 5, 7, 13 and 29.

 What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        long a = 445454532L;

        for(int i=2; i<(a/i); i++){                         // no factors would exist beyond a/i for a particular i

            while( a%i == 0){                               // if i is a factor
                a = a/i;                                    // divide a by i else we wont get a prime number
                System.out.print(a + " x " + i + "\n");
            }
        }

        if(a > 1)
            System.out.println("largest prime factor: " + a);
    }

}

