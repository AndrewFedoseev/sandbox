package basictests;

/**
 * Created by Andrii.Fiedosieiev on 6/28/2017.
 */
public class FindStringInString1 {
    public static void main(String[] args) {
        String firstString = "bccaaabccabcc";
        String secondString = "bcc";

        int count = 0;
        for (int i = 0; i < firstString.length() - 1; i++) {
            /*int y = i;
            if (secondString.length() - 1 <= i) {
                y = 0;
            }*/
    //        if ((firstString.charAt(i) == secondString.charAt(y)) && (firstString.charAt(i + 1) == secondString.charAt(y + 1)))
                count++;
        }
        System.out.println(count);
    }
}
