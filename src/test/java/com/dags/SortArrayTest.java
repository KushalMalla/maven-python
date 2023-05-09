import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SortArrayTest{
    public void sortArray{
        SortArray sortTests = new SortArray();
        int[] array = {5, 8, 3, 9, 1, 6};
        sortTests.sortArray(array);
        Assertions.assertArrayEquals(new int[]{1, 3, 5, 6, 8, 9}, array);
    }
}