package basictests;

/**
 * Created by Andrii.Fiedosieiev on 6/29/2017.
 */
public class HighestAmountOfDigits2 {
    public static void main(String[] args) {
        int[] numbers = {111, 222, 333, 444, 5555, 99};
        String digit;
        int sumOfDigits = 0;
        int maxSumOfDigit = 0;
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            digit = String.valueOf((numbers[i]));
            for (int j = 0; j < digit.length(); j++) {
                sumOfDigits += Integer.parseInt(String.valueOf(digit.charAt(j)));
                if (maxSumOfDigit < sumOfDigits) {
                    maxSumOfDigit = sumOfDigits;
                    max = numbers[i];
                }
            }
            sumOfDigits = 0;
        }
        System.out.println("the digit is " + max + " and the sum is " +maxSumOfDigit);
    }
}
