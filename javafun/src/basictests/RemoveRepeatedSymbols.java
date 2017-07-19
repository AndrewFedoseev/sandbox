package basictests;

/**
 * Created by Andrii.Fiedosieiev on 7/14/2017.
 */
public class RemoveRepeatedSymbols {
    public static void main(String[] args) {

        String str = "abbsaaaaaaaaaaaaaaaaaaaaaaaaaaaaassbsbbbssssssssssssssssssssssssss";
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                sb.deleteCharAt(i + 1);
                str = sb.toString();
                i = --i;
            }
        }
        System.out.println(str);
    }
}

  /*  public static void main(String[] args) {
        dublicat("abcbba");
    }

    public static void dublicat(String text) {
        String[] letters = text.split("");
        String[] newLetters = new String[letters.length - 1];

        for (int i = 0; i < letters.length; i++) {

            if (!letters[i].equals(letters[i + 1])) {
                newLetters[i] = letters[i];
            }

            System.out.println(newLetters[i]);
        }
    }
*/