package basictests;

/**
 * Created by Andrii.Fiedosieiev on 7/24/2017.
 */
public class ArrayContainsDuplicate {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 1};


    }

    public boolean containsDuplicates(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
