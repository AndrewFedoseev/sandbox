package basictests;

/**
 * Created by Andrii.Fiedosieiev on 7/14/2017.
 */
public class Palindrom {
    public static void main(String[] args) {
        String str = "aba";
        StringBuilder sb = new StringBuilder(str);
        if (str.replaceAll(" ", "").equals(sb.reverse().toString().replaceAll(" ", ""))) {
            System.out.println("It's palindrom");
        } else
            System.out.println("It's not palindrom");
    }
}