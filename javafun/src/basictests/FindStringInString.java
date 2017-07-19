package basictests;

/**
 * Created by Andrii.Fiedosieiev on 6/28/2017.
 */
public class FindStringInString {

    public static void main(String[] args) {
        String firstString = "aaaaaa";
        String secondString = "aaa";

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < firstString.length(); i++) {
            int y = i;
            if (secondString.length() <= i) {
                y = 0;
            }
            if (firstString.charAt(i) == secondString.charAt(y)) {
                count1++;
                for (int j = i+1; j < secondString.length(); j++) {
                    if (firstString.charAt(i + 1) == secondString.charAt(j)) {
                        count2++;
                        if (count1 == count2) {
                            count3++;
                        }
                    }
                }

            }
        }
        System.out.println(count3);
    }
}

