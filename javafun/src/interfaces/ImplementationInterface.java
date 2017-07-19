package interfaces;

/**
 * Created by Andrii.Fiedosieiev on 6/15/2017.
 */
public class ImplementationInterface implements SumInterface{
    public int somemethod (int n1, int n2){
        n1 = n2++;
        return n1;
    }
}
