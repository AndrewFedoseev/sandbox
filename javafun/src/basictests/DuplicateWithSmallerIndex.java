package basictests;

/**
 * Created by Andrii.Fiedosieiev on 7/24/2017.
 */
public class DuplicateWithSmallerIndex {
    public static void main(String[] args) {
        int a[] = {2, 3, 3};
        int index = 0;
        int index1 = 0;
        int count = 0;

        for (int i = 0; i < a.length/2; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    index = j;
                    index1 = i;
                    count++;
                }

            }
        }
        if (count == 0) {
            System.out.println("-1");
        } else
            System.out.println(index + " " + index1);
    }

   /* int firstDuplicate(int[] a) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j && count == 0) {
                    index = i;
                    count++;
                }
            }
        }
        if (count == 0){
            return -1;
        }else
            return a[index];
    }
*/

}


