package basictests;

/**
 * Created by Andrii.Fiedosieiev on 6/28/2017.
 */
public class LetterInString {
    public static void main(String[] args) {
        String str = "addjjfaaafkjfa";
        char a = 'a';
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                count++;
            }
        }
        System.out.println(count);
    }
}
